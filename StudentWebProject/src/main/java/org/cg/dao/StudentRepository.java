package org.cg.dao;

import org.cg.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends StudentDao, JpaRepository<Student, Integer>{

}
