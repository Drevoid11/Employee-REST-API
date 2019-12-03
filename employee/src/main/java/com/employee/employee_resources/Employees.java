package com.employee.employee_resources;

import javax.ws.rs.core.MediaType;

import com.employee.model.Employee;
import com.employee.service.EmployeeService;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/employees")
public class Employees {
	
	EmployeeService e = new EmployeeService();
	

	@GET
    @Produces(MediaType.APPLICATION_JSON)
	public List<Employee> getEmployees() {
		return e.getAllEmployees();
	}
	
}
