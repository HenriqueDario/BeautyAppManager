package com.darioprod.beautyapp.dao;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.darioprod.beautyapp.model.Employee;

@Repository
public class EmployeeDaoImpl extends AbstractDao<Employee, Long> implements EmployeeDao {

	@Override
	public List<Employee> findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> findByPositionId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> findByEntryDateAndOutputDate(LocalDate admissionDate, LocalDate resignationDate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> findByEntryDate(LocalDate admissionDate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> findByOutputDate(LocalDate outputresignationDateDate) {
		// TODO Auto-generated method stub
		return null;
	}

}
