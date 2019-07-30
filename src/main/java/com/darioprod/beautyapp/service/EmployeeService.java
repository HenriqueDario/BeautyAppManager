package com.darioprod.beautyapp.service;

import java.time.LocalDate;
import java.util.List;

import com.darioprod.beautyapp.model.Employee;

public interface EmployeeService {
	void save(Employee employee);

	void update(Employee employee) ;

	void delete(Long id);

	Employee findById(Long id);

	List<Employee> findAll();

	List<Employee> findByName(String name);

	List<Employee> findByPositionId(Long id);

	List<Employee> findByDate(LocalDate admissionDate, LocalDate resignationDate);
}
