package com.darioprod.beautyapp.service;

import java.util.List;

import com.darioprod.beautyapp.model.Department;

public interface DepartmentService {
	void save(Department department);

	void update(Department department) ;

	void delete(Long id);

	Department findById(Long id);

	List<Department> findAll();

	boolean departmentHavePositions(Long id);
}
