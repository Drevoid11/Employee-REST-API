package com.employee.employee_resources;

import javax.ws.rs.core.MediaType;

import com.employee.model.Employee;
import com.employee.service.EmployeeService;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/employees")
public class Employees {
	
	EmployeeService e = new EmployeeService();
	

	@GET
    @Produces(MediaType.APPLICATION_JSON)
	public List<Employee> getEmployees() {
		return e.getAllEmployees();
	}
	
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Employee addEmployee(Employee employee) {
		return EmployeeService.addEmployee(employee);
	}
	
	@PUT
	@Path("/{employeeId}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Employee updateEmployee(@PathParam("employeeId") long id,Employee employee) {
		employee.setId(id);
		return EmployeeService.updateEmployee(employee);
	}
	
	@DELETE
	@Path("/{employeeId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Employee deleteEmployee(@PathParam("employeeId") long id) {
		return EmployeeService.removeEmployee(id);
	}
	
	@GET
	@Path("/{employeeId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Employee getEmployeeInfo(@PathParam("employeeId") long id) {
		return EmployeeService.getEmployee(id);
	}
	

}
