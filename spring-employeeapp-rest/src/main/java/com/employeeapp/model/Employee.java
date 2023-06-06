package com.employeeapp.model;

public class Employee {

	private String name;
	private Integer employeeId;
	private String designation;
	private String city;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Employee(String name, Integer employeeId, String designation, String city) {
		super();
		this.name = name;
		this.employeeId = employeeId;
		this.designation = designation;
		this.city = city;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Integer getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}


	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", employeeId=" + employeeId + ", designation=" + designation + ", city="
				+ city + "]";
	}
	
	
	
	
}
