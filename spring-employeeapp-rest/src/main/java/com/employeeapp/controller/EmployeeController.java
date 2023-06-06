package com.employeeapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.employeeapp.model.Employee;
import com.employeeapp.service.EmployeeService;

@RestController
@RequestMapping(value="/employee-api")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;

	//http://localhost:8080/employee-api/employees
	@GetMapping(value="/employees")
	List<Employee> getAll(){
		return employeeService.getAll();
		
		
	}
	//http://localhost:8080/employee-api/employees/designation/city/designation=value/city=value
	@GetMapping(value="/employees/designation/city")
	List<Employee> getByDesignationCity(@RequestParam("designation") String designation, @RequestParam("city") String city){
		return employeeService.getByDesignationCity(designation, city);
		
	}
	//http://localhost:8080/employee-api/employees/employeeId/101
	@GetMapping(value="/employees/employeeId/{employeeId}")
	Employee getById(@PathVariable("employeeId") int id) {
		return employeeService.getById(id);
		
	}
	// http://localhost:8080/employee-api/employees/name/y/city/bhopal
	@GetMapping(value="/employees/name/{employeeName}/city/{city}")
	List<Employee> getByStartingNameAndCity(@PathVariable("employeeName") String name, @PathVariable("city") String city){
		return employeeService.getByStartingNameAndCity(name, city);
		
	}
}
