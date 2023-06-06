package com.employeeapp.util;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.employeeapp.model.Employee;

@Component
public class EmployeeDetails {

	public List<Employee> showEmployees(){
		
		List<Employee> employees=new ArrayList<>();
	    employees.add(new Employee("yuvraj",101,"developer","bhopal"));
	    employees.add(new Employee("jack",102,"manager","indore"));
	    employees.add(new Employee("poppye",103,"team lead","pune"));
	    employees.add(new Employee("shizuka",104,"developer","mumbai"));
	    employees.add(new Employee("nobita",105,"manager","navi mumbai"));
	    employees.add(new Employee("doremon",106,"team lead","bangalore"));
	    employees.add(new Employee("jerry",107,"magaer","goa"));
	    employees.add(new Employee("tom",108,"developer","chennai"));
		return employees;
	}
}
