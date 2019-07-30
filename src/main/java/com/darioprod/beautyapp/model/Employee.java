package com.darioprod.beautyapp.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

@SuppressWarnings("serial")
@Entity
@Table(name = "employee")
public class Employee extends AbstractModel<Long> {		

	@Column(nullable = false)
	private String name;
	
	@DateTimeFormat(iso = ISO.DATE)
	@Column(name="birthdate", nullable = false, columnDefinition = "DATE")
	private LocalDate birthDate;		

	@Column(nullable = false, unique = true)
	private String phone;		

	@Column(nullable = false, unique = true)
	@Email
	private String email;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_address_fk")
	private Address address;
	
	@NumberFormat(style = Style.CURRENCY, pattern="#,##0.00")
	@Column(nullable = false, columnDefinition = "DECIMAL(10,2) DEFAULT 0.00")
	private BigDecimal salary;	

	@DateTimeFormat(iso = ISO.DATE)
	@Column(name="admission_date", nullable = false, columnDefinition = "DATE")
	private LocalDate admissionDate;	

	@DateTimeFormat(iso = ISO.DATE)
	@Column(name="resignation_date", columnDefinition = "DATE")
	private LocalDate resignationDate;		

	@ManyToOne
	@JoinColumn(name = "position_id_fk")
	private Position position;	
	
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
	public Position getPosition() {
		return position;
	}
	public void setPosition(Position position) {
		this.position = position;
	}
}
