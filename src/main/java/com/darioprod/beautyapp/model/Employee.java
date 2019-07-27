package com.darioprod.beautyapp.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "employee")
public class Employee extends AbstractModel<Long> {	
	
	private String name;
	private LocalDate birthDate;
	private String phone;
	private String email;
	private Address address;
	private BigDecimal salary;
	private LocalDate admissionDate;
	private LocalDate resignationDate;	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public BigDecimal getSalary() {
		return salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	public LocalDate getAdmissionDate() {
		return admissionDate;
	}
	public void setAdmissionDate(LocalDate admissionDate) {
		this.admissionDate = admissionDate;
	}
	public LocalDate getResignationDate() {
		return resignationDate;
	}
	public void setResignationDate(LocalDate resignationDate) {
		this.resignationDate = resignationDate;
	}
}
