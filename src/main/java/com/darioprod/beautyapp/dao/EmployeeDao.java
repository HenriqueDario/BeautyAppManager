package com.darioprod.beautyapp.dao;

import java.time.LocalDate;
import java.util.List;

import com.darioprod.beautyapp.model.Employee;

public interface EmployeeDao {
	void save(Employee employee);

	void update(Employee employee) ;

	void delete(Long id);

	Employee findById(Long id);

	List<Employee> findAll();	

	List<Employee> findByName(String name);

	List<Employee> findByPositionId(Long id);

	List<Employee> findByEntryDateAndOutputDate(LocalDate admissionDate, LocalDate resignationDate);

	List<Employee> findByEntryDate(LocalDate admissionDate);

	List<Employee> findByOutputDate(LocalDate resignationDate);
}
