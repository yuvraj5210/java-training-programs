package com.shristi.objbasics;

class Employee {
	private String name;
	private String designation;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Employee(String name, String designation) {
		super();
		this.name = name;
		this.designation = designation;
	}

	public double calcBonus(double basicAllowance) {
		return basicAllowance;
	}

	public double calcBonus(double basicAllowance, double carAllowance) {
		return (basicAllowance + carAllowance);
	}

	public double calcBonus(double basicAllowance, double carAllowance, double houseAllowance) {
		return basicAllowance + carAllowance + houseAllowance;
	}

}

public class Mainc3 {
	public static void main(String[] args) {
		Employee employee = new Employee("yuvraj", "programmer");
		
		if (employee.getDesignation().equals("programmer")) {
			System.out.println(employee.calcBonus(4000.0));
		}
	    if(employee.getDesignation().equals("manager"))
		{
			System.out.println(employee.calcBonus(20000.0, 500.0));
		}
		if(employee.getDesignation().equals("director"))
		{
			System.out.println(employee.calcBonus(4000.0,5099.0,324852.0));
		}
		
		//______
		
		Employee employee2 = new Employee("raj", "manager");
		if (employee2.getDesignation().equals("programmer")) {
			System.out.println(employee2.calcBonus(4000.0));
		}
	    if(employee2.getDesignation().equals("manager"))
		{
			System.out.println(employee2.calcBonus(20000.0, 500.0));
		}
		if(employee2.getDesignation().equals("director"))
		{
			System.out.println(employee2.calcBonus(4000.0,5099.0,324852.0));
		}
		//-------------------
		Employee employee3 = new Employee("ashok", "director");
		if (employee3.getDesignation().equals("programmer")) {
			System.out.println(employee3.calcBonus(4000.0));
		}
	    if(employee3.getDesignation().equals("manager"))
		{
			System.out.println(employee3.calcBonus(20000.0, 500.0));
		}
		if(employee3.getDesignation().equals("director"))
		{
			System.out.println(employee3.calcBonus(4000.0,5099.0,324852.0));
		}
	}

}
