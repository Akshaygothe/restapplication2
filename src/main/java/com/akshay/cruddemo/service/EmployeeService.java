package com.akshay.cruddemo.service;

import java.util.List;

import com.akshay.cruddemo.entity.Employee;

public interface EmployeeService {

	List<Employee> findAll();
	
	Employee findById(int theId);
	
	Employee save(Employee theEmployee);
	
	void deleteById(int thdId);
}
