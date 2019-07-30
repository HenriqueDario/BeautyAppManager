package com.darioprod.beautyapp.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.darioprod.beautyapp.dao.EmployeeDao;
import com.darioprod.beautyapp.model.Employee;

@Service @Transactional
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeDao dao;

	@Override
	public void save(Employee employee) {
		dao.save(employee);
	}

	@Override
	public void update(Employee employee) {
		dao.update(employee);
	}

	@Override
	public void delete(Long id) {
		dao.delete(id);
	}

	@Override @Transactional(readOnly = true)
	public Employee findById(Long id) {
		return dao.findById(id);
	}
	
	@Override @Transactional(readOnly = true)
	public List<Employee> findAll() {
		return dao.findAll();
	}

	@Override @Transactional(readOnly = true)
	public List<Employee> findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override @Transactional(readOnly = true)
	public List<Employee> findByPositionId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> findByDate(LocalDate admissionDate, LocalDate resignationDate) {
		// TODO Auto-generated method stub
		return null;
	}
}
