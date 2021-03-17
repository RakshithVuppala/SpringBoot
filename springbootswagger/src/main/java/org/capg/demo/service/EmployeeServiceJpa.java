package org.capg.demo.service;

import java.util.List;
import java.util.Optional;

import org.capg.demo.bean.Employee;
import org.capg.demo.dao.EmployeeDaoJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("jpaService")
public class EmployeeServiceJpa implements EmployeeService{

	@Autowired
	EmployeeDaoJpa eDao;
	@Override
	public List<Employee> printAllEmployee() {
		return eDao.findAll();
	}

	@Override
	public Employee findEmployee(int empid) {
		Optional<Employee> op=eDao.findById(empid);
		if(op.isPresent())
			return op.get();
		return null;
	}

	@Override
	public List<Employee> createEmployee(Employee e) {
		eDao.saveAndFlush(e);
		return eDao.findAll();
	}

	@Override
	public List<Employee> removeEmployee(int empid) {
		eDao.deleteById(empid);;
		return eDao.findAll();
	}

	@Override
	public List<Employee> updateEmployee(Employee e) {
		eDao.saveAndFlush(e);
		return eDao.findAll();
	}

	@Override
	public List<Employee> findEmployeeByName(String name) {
		return eDao.findByName(name);
	}

	@Override
	public List<Employee> findEmployeeBySalary(double salary) {
		return eDao.findBySalary(salary);
	}

}
