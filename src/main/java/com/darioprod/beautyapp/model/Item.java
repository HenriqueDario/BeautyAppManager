package com.darioprod.beautyapp.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "productItem")
public class Item extends Product{

	private BigDecimal purchasePrice;
	private BigDecimal salePrice;
	private Integer quantity;
	private LocalDate entryDate;
	private LocalDate outputDate;
	
	
	public BigDecimal getPurchasePrice() {
		return purchasePrice;
	}
	public void setPurchasePrice(BigDecimal purchasePrice) {
		this.purchasePrice = purchasePrice;
	}
	public BigDecimal getSalePrice() {
		return salePrice;
	}
	public void setSalePrice(BigDecimal salePrice) {
		this.salePrice = salePrice;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public LocalDate getEntryDate() {
		return entryDate;
	}
	public void setEntryDate(LocalDate entryDate) {
		this.entryDate = entryDate;
	}
	public LocalDate getOutputDate() {
		return outputDate;
	}
	public void setOutputDate(LocalDate outputDate) {
		this.outputDate = outputDate;
	}
	
	
	
	
}
