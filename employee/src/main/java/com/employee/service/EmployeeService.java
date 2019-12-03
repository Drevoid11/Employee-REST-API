package com.employee.service;

import java.util.ArrayList;
import java.util.List;

import com.employee.model.Employee;

public class EmployeeService {
	
	public List<Employee> getAllEmployees(){
		
		Employee e1 = new Employee(1L,"Chinmay","Paranjape");
		Employee e2 = new Employee(2L,"Thomas","Muller");
		List<Employee> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		return list;
	}
		
}
