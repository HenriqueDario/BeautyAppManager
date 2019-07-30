package com.darioprod.beautyapp.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@SuppressWarnings("serial")
@Entity
@Table(name = "department")
public class Department extends AbstractModel<Long>{

	@NotBlank(message= "Informe um nome.")
	@Size(min = 3, max = 100, message = "o nome do departamento deve ter entre {min} e {max} caracteres.")
	@Column(name = "name", nullable = false, unique = true, length = 60)
	private String name;	

	@OneToMany(mappedBy = "department")
	private List<Position> positions;	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Position> getPositions() {
		return positions;
	}
	public void setPositions(List<Position> positions) {
		this.positions = positions;
	}
	
	
}
