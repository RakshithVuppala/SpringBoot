package org.capg.demo.service;

import java.util.List;

import org.capg.demo.bean.Employee;

public interface EmployeeService {
	public List<Employee> printAllEmployee();
	public Employee findEmployee(int empid);
	public List<Employee> createEmployee(Employee e);
	public List<Employee> removeEmployee(int empid);
	public List<Employee> updateEmployee(Employee e);
	public List<Employee> findEmployeeByName(String name);
	public List<Employee> findEmployeeBySalary(double salary);
}
