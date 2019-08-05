package com.darioprod.beautyapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "reason")
public class Reason extends AbstractModel<Long>{		
	
	@Column(nullable = false)
	private String description;
	
}
