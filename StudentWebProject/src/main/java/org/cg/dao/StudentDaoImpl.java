package org.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.cg.model.Student;
import org.springframework.stereotype.Repository;

@Repository
@Transactional //If we have to do the transaction we use this annotation We don't need to begin and commit the transaction 
public class StudentDaoImpl implements StudentDao{
	
	@PersistenceContext
	EntityManager em;
	/*
	@Override
	public List<Student> createStudent(Student s) {
		em.persist(s);
		return getAllStudent();
	}

	@Override
	public List<Student> getAllStudent() {
		TypedQuery<Student> q=em.createQuery("select s from Student s",Student.class);
		return q.getResultList();
	}*/

	@Override
	public List<Student> getStudentByName(String name) {
		TypedQuery<Student> q=em.createQuery("select s from Student s where s.name like :n",Student.class);
		q.setParameter("n",name+"%");
		return q.getResultList();
	}

}
