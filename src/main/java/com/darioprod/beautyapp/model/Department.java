package com.darioprod.beautyapp.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name=  "department")
public class Department extends AbstractModel<Long>{

	private String name;
	//private List<Position> positions;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
/*	public List<Position> getPositions() {
		return positions;
	}
	public void setPositions(List<Position> positions) {
		this.positions = positions;
	}
	*/
	
}
