package com.employeeapp.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeeapp.model.Employee;
import com.employeeapp.util.EmployeeDetails;

@Service
public class EmployeeService implements IEmployeeService {

	@Autowired
	EmployeeDetails details;
	
	@Override
	public List<Employee> getAll() {
		return details.showEmployees();
	}

	@Override
	public List<Employee> getByDesignationCity(String designation, String city) {
		return details.showEmployees()
				.stream().filter(employee->employee.getDesignation().equals(designation) && employee.getCity().equals(city))
				.collect(Collectors.toList());
	}

	@Override
	public Employee getById(int id) {
		return details.showEmployees()
				.stream()
				.filter(employee->employee.getEmployeeId()==id)
				.findFirst().get();
	}

	@Override
	public List<Employee> getByStartingNameAndCity(String name, String city) {
		return details.showEmployees()
				.stream()
				.filter(employee-> employee.getName().startsWith(name) || employee.getCity().startsWith(city))
				.collect(Collectors.toList());
	}

}
