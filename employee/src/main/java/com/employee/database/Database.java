package com.employee.database;

import java.util.*;

import com.employee.model.Department;
import com.employee.model.Employee;

public class Database {

	private static Map<Long,Employee> employees = new HashMap<>();
	private static Map<Long,Department> departments = new HashMap<>();
	
	public static Map<Long, Employee> getEmployee() {
		return employees;
	}
	
	public static Map<Long, Department> getDepartment() {
		return departments;
	}
	
	
	
}
