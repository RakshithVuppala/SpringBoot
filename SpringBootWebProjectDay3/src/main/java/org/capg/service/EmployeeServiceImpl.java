package org.capg.service;

import java.util.List;

import org.capg.bean.Employee;
import org.capg.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeDao edao;
	
	@Override
	public List<Employee> printAllEmployee() {
		
		return edao.getAllEmployee();
	}

	@Override
	public Employee findEmployee(int empid) {
		// TODO Auto-generated method stub
		return edao.findEmployee(empid);
	}

	@Override
	public List<Employee> createEmployee(Employee e) {
		if(e.getEmpid()==0 || e.getName()==null)
			return null;
		return edao.createEmployee(e);
		
	}

	@Override
	public List<Employee> removeEmployee(int empid) {
		
		return edao.deleteEmployee(empid);
	}

	@Override
	public List<Employee> updateEmployee(Employee e) {
		if(e.getEmpid()==0 || e.getName()==null)
			return null;
		return edao.updateEmployee(e);
	}

}
