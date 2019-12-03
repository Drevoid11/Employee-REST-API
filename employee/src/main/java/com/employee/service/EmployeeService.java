package com.employee.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.employee.database.Database;
import com.employee.model.Employee;

public class EmployeeService {
	
	
	private static Map<Long,Employee> employees = Database.getEmployee(); 
	
	public EmployeeService() {
		employees.put(1L,new Employee(1,"Robert","Lewandowski"));
		employees.put(2L,new Employee(2,"Thomas","Muller"));
	}
	
	public List<Employee> getAllEmployees(){
		// Passing a collection to the ArrayList constructor, initialized the List with those elements.
		return new ArrayList<Employee>(employees.values()); 	
	}
	
	public static Employee getEmployee(long id) {
		return employees.get(id);
	}
		
	public static Employee addEmployee(Employee employee) {
		employee.setId(employees.size()+1);
		employees.put(employee.getId(),employee);
		return employee;
	}
	
	public static Employee updateEmployee(Employee employee) {
		if(employee.getId() <= 0) {
			return null;	
		}
		employees.put(employee.getId(), employee);
		return employee;
		
	}
	
	public static Employee removeEmployee(long id) {
		return employees.remove(id);
	}
}
