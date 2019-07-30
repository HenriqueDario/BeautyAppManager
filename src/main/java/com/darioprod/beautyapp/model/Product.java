package com.darioprod.beautyapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "product")
public class Product  extends AbstractModel<Long>{

	@Column(nullable = false)
	private String description;

	@Column(nullable = false)	
	private boolean isSalable;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isSalable() {
		return isSalable;
	}

	public void setSalable(boolean isSalable) {
		this.isSalable = isSalable;
	}	
	
}
