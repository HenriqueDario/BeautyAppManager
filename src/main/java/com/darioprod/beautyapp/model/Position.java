package com.darioprod.beautyapp.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "position")
public class Position  extends AbstractModel<Long>{

	
	private String name;
	private Department department;	
	//private List<Employee> employees;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	/*public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}*/
	
	
}
	