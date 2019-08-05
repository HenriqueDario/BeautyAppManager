package com.darioprod.beautyapp.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.format.annotation.NumberFormat.Style;

@SuppressWarnings("serial")
@Entity
@Table(name = "item")
public class Item extends AbstractModel<Long>{	
	
	@NumberFormat(style = Style.CURRENCY, pattern="#,##0.00")
	@Column(nullable = false, columnDefinition = "DECIMAL(10,2) DEFAULT 0.00")
	private BigDecimal purchasePrice;	

	@NumberFormat(style = Style.CURRENCY, pattern="#,##0.00")
	@Column(columnDefinition = "DECIMAL(10,2) DEFAULT 0.00")
	private BigDecimal salePrice;	

	@Column(nullable = false)
	private Integer quantity;	

	@DateTimeFormat(iso = ISO.DATE)
	@Column(name="entry_date", columnDefinition = "DATE")
	private LocalDate entryDate;

	@DateTimeFormat(iso = ISO.DATE)
	@Column(name="output_date", columnDefinition = "DATE")
	private LocalDate outputDate;
	
	@NotNull(message = "Selecione o Produto")
	@ManyToOne
	@JoinColumn(name = "id_product_fk")
	private Product product;
	
	
	
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
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
	
	
	
}
