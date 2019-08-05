package com.darioprod.beautyapp.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "product")
public class Product  extends AbstractModel<Long>{

	@Column(nullable = false)
	private String description;

	@OneToMany(mappedBy = "product")
	private List<Item> items;	

	private String isSalable;
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getIsSalable() {
		return isSalable;
	}

	public void setIsSalable(String isSalable) {
		this.isSalable = isSalable;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

}
