package com.employee.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Employee {

	public long id;
	public Date dob;
	public String name;
	public String surname;
	
	public Employee() {
		
	}
	
	public Employee(long id, String name, String surname) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.dob = new Date();

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	} 
	
	
	
	
}
