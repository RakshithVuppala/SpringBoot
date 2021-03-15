package org.capg.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.capg.bean.Employee;
import org.springframework.stereotype.Repository;

@Repository 
public class EmployeeDaoImpl implements EmployeeDao{

	private static List<Employee> empList;
	
	static {
		empList=new ArrayList<Employee>();
		empList.add(new Employee(1001,"Rakshith",50000.0,LocalDate.parse("1999-08-06")));
		empList.add(new Employee(1002,"Nihan",50000.0, LocalDate.parse("1997-08-06")));
		empList.add(new Employee(1003,"Vasantha rao",50000.0, LocalDate.parse("1962-08-06")));
		empList.add(new Employee(1004,"harini",50000.0, LocalDate.parse("2010-08-06")));
		empList.add(new Employee(1005,"Jaya sree",50000.0, LocalDate.parse("1968-08-06")));
	}
	
	@Override
	public List<Employee> getAllEmployee() {
		return empList;
	}

	@Override
	public Employee findEmployee(int empid) {
		for(Employee e:empList) {
			if(e.getEmpid()==empid)
				return e;
		}
		return null;//empList.stream().filter(e->e.getEmpid()==empid).collect(Collectors.toList()).get(0);
	}

	@Override
	public List<Employee> createEmployee(Employee e) {
		empList.add(e);
		return empList;
	}

	@Override
	public List<Employee> deleteEmployee(int empid) {
		Employee e=findEmployee(empid);
		if(e!=null) {
			empList.remove(e);
			return empList;
		}
		return null;
	}

	@Override
	public List<Employee> updateEmployee(Employee e) {
		int counter=0;
		for(Employee e1:empList) {
			
			if(e1.getEmpid()==e.getEmpid()) {
				empList.set(counter, e);
				return empList; 
			}
			counter++;
		}
		return null;
	}
	

}
