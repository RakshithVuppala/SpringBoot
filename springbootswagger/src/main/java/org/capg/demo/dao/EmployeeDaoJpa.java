package org.capg.demo.dao;

import java.util.List;

import org.capg.demo.bean.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository("tDao")
public interface EmployeeDaoJpa extends JpaRepository<Employee, Integer>{
	//To do other than curd operations
	@Query("select e from Employee e where e.name like :n%")
	public List<Employee> findByName(@Param("n")String name);
	// We can do our own query
	@Query("select e from Employee e where e.salary<=:sal")
	public List<Employee> findBySalary(@Param("sal")double salary);
}
