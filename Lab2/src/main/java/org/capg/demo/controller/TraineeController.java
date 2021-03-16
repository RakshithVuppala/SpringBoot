package org.capg.demo.controller;

import java.util.List;

import org.capg.demo.bean.Trainee;
import org.capg.demo.service.TraineeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/trainee")
public class TraineeController {

	@Autowired
	TraineeService jpaService;
	
	@GetMapping(value="/all")
	public List<Trainee> getAllTrainee(){
		return jpaService.printAllTrainee();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Trainee> findTrainee(@PathVariable int id) {
		Trainee t= jpaService.findById(id);
		if(t!=null)
			return new ResponseEntity<Trainee>(t,HttpStatus.OK);
		else
			return new ResponseEntity("Sorry! Employee is not available with Employee id "+id,HttpStatus.NOT_FOUND);
	}
	
	@GetMapping("/name/{name}")
	public List<Trainee> getTraineeByName(@PathVariable String name){
		return jpaService.findByName(name);
	}
	
	@PostMapping(value="/create")
	public List<Trainee> createTrainee(@RequestBody Trainee t){
		return jpaService.insertTrainee(t);
	}
	
	@DeleteMapping(value="/remove/{id}")
	public List<Trainee> removeTrainee(@PathVariable int id){
		return jpaService.deleteTrainee(id);
	}
	
	@PutMapping(value = "/update")
	public List<Trainee> updateTrainee(@RequestBody Trainee t){
		return jpaService.updateTrainee(t);
	}
}
