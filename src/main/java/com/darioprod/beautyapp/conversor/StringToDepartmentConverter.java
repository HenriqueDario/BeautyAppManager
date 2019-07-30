package com.darioprod.beautyapp.conversor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.darioprod.beautyapp.model.Department;
import com.darioprod.beautyapp.service.DepartmentService;

@Component
public class StringToDepartmentConverter implements Converter<String, Department>{

	@Autowired
	private DepartmentService departmentService;
	
	@Override
	public Department convert(String text) {
		if(text.isEmpty()) {
			return null;
		}
		Long id = Long.valueOf(text);
		return departmentService.findById(id);
	}

}
