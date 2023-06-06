package com.employeeapp.service;

import java.util.List;

import com.employeeapp.model.Employee;

public interface IEmployeeService {

	List<Employee> getAll();
	List<Employee> getByDesignationCity(String designation,String city);
	Employee getById(int id);
	List<Employee> getByStartingNameAndCity(String name,String city);
	
}
