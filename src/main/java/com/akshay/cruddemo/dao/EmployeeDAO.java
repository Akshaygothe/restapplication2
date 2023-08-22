package com.akshay.cruddemo.dao;

import java.util.List;

import com.akshay.cruddemo.entity.Employee;

public interface EmployeeDAO {

	List<Employee> findAll();
	
	Employee findById(int theId);
	
	Employee save(Employee theEmployee);
	
	void deleteById(int thdId);
}
