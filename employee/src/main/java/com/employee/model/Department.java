package com.employee.model;

import java.util.Date;

public class Department {

	public long id;
	public Date dob;
	public String dept_name;
	
	public Department() {
		
	}

	public Department(long id, String dept_name) {
		this.id = id;
		this.dept_name = dept_name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getDept_name() {
		return dept_name;
	}

	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	
	
	
}
