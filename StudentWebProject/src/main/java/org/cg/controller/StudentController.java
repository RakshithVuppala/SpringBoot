package org.cg.controller;

import java.util.List;

import org.cg.exception.StudentNotFoundException;
import org.cg.model.Student;
import org.cg.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	StudentService sService;
	
	@GetMapping(value="/all")
	public List<Student> printAllStudent() {
		return sService.getAllStudent();
	}
	
	@PostMapping("/create")
	public List<Student> createStudent(@RequestBody Student s){
		return sService.createStudent(s);
	}
	
	@GetMapping("/name/{name}")
	public List<Student> printAllStudentByName(@PathVariable String name){
		return sService.getStudentByName(name);
	}
	
	@GetMapping(value="/id/{id}", produces = MediaType.APPLICATION_XML_VALUE)
	public Student printStudent(@PathVariable int id) throws StudentNotFoundException{
		Student s=null;
		try {
			s=sService.getStudentById(id);
		}
		catch(Exception e) {
			throw new StudentNotFoundException("Student with id "+id+" is not available!");
		}
		
		return sService.getStudentById(id);
	}
	
	/*	
	@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Student with given id is not present")
	@ExceptionHandler({Exception.class})
	public void handleException() {
		
	}*/
}
