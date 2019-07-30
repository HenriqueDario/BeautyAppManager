package com.darioprod.beautyapp.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@SuppressWarnings("serial")
@Entity
@Table(name = "position")
public class Position  extends AbstractModel<Long>{

	@NotBlank(message= "Informe um nome.")
	@Size(min = 3, max = 100, message = "o nome do departamento deve ter entre {min} e {max} caracteres.")
	@Column(name = "name", nullable = false, unique = true, length = 60)
	private String name;
	
	@NotNull(message = "Selecione o departamento relativo ao cargo")
	@ManyToOne
	@JoinColumn(name = "id_department_fk")
	private Department department;	
	
	@OneToMany(mappedBy = "position")
	private List<Employee> employees;	
	
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
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	
	
}
	