package com.darioprod.beautyapp.model;

import java.math.BigDecimal;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "service")
public class Service extends AbstractModel<Long>{
	
	private String name;
	private BigDecimal serviceCost;
	private LocalTime timeSpent;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getServiceCost() {
		return serviceCost;
	}
	public void setServiceCost(BigDecimal serviceCost) {
		this.serviceCost = serviceCost;
	}
	public LocalTime getTimeSpent() {
		return timeSpent;
	}
	public void setTimeSpent(LocalTime timeSpent) {
		this.timeSpent = timeSpent;
	}
}
