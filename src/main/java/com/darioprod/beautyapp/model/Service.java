package com.darioprod.beautyapp.model;

import java.math.BigDecimal;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

@SuppressWarnings("serial")
@Entity
@Table(name = "service")
public class Service extends AbstractModel<Long>{
	
	@Column(nullable = false)
	private String name;
	
	@NumberFormat(style = Style.CURRENCY, pattern="#,##0.00")
	@Column(nullable = false, columnDefinition = "DECIMAL(10,2) DEFAULT 0.00")
	private BigDecimal serviceCost;
	
	@DateTimeFormat(iso = ISO.TIME)
	@Column(name = "time_spent", nullable = false, columnDefinition = "TIME")
	private LocalTime timeSpent;	
	
	@ManyToOne
	private Scheduling scheduling;
	
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
