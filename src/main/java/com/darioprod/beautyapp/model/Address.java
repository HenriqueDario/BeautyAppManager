package com.darioprod.beautyapp.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "address")
public class Address extends AbstractModel<Long>{
	
	private String number;
	private String city;
	private String complement;
	private String postalCode;
	private String publicPlace; //logradouro
	private UF uf;
	
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getComplement() {
		return complement;
	}
	public void setComplement(String complement) {
		this.complement = complement;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getPublicPlace() {
		return publicPlace;
	}
	public void setPublicPlace(String publicPlace) {
		this.publicPlace = publicPlace;
	}
	public UF getUf() {
		return uf;
	}
	public void setUf(UF uf) {
		this.uf = uf;
	}
	
	
	
}
