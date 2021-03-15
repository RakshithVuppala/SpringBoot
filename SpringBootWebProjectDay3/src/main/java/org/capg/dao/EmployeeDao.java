package org.capg.dao;

import java.util.List;

import org.capg.bean.Employee;

public interface EmployeeDao {
	public List<Employee> getAllEmployee();
	public Employee findEmployee(int empid);
	public List<Employee> createEmployee(Employee e);
	public List<Employee> deleteEmployee(int empid);
	public List<Employee> updateEmployee(Employee e);
}
