package org.cg.service;

import java.util.List;


import org.cg.dao.StudentRepository;
import org.cg.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentRepository sDao;
	
	@Override
	public List<Student> getAllStudent() {
		return sDao.findAll();
	}

	@Override
	public List<Student> createStudent(Student s) {
		sDao.saveAndFlush(s);
		return sDao.findAll();
	}

	@Override
	public List<Student> getStudentByName(String name) {
		return sDao.getStudentByName(name);
	}

	@Override
	public Student getStudentById(int id) {
		return sDao.findById(id).get();
	}
	
}
