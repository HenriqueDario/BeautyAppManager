package com.darioprod.beautyapp.model;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@SuppressWarnings("serial")
@Entity
@Table(name = "scheduling")
public class Scheduling extends AbstractModel<Long> {

	@DateTimeFormat(iso = ISO.DATE_TIME)
	@Column(name="scheduling_DateTime", columnDefinition = "TIMESTAMP")
	private Timestamp schedulingDateTime;
	
	@ManyToOne
	@JoinColumn(name = "id_client_fk")
	private Client scheduledClient;
	
	@NotNull(message = "Selecione um funcionário para o agendamento")
	@ManyToOne
	@JoinColumn(name = "id_employee_fk")
	private Employee scheduledEmployee;

	@OneToMany
	private List<Service> scheduledServices;
	
	public Timestamp getSchedulingDateTime() {
		return schedulingDateTime;
	}
	public void setSchedulingDateTime(Timestamp schedulingDateTime) {
		this.schedulingDateTime = schedulingDateTime;
	}
	public Client getScheduledClient() {
		return scheduledClient;
	}
	public void setScheduledClient(Client scheduledClient) {
		this.scheduledClient = scheduledClient;
	}
	public Employee getScheduledEmployee() {
		return scheduledEmployee;
	}
	public void setScheduledEmployee(Employee scheduledEmployee) {
		this.scheduledEmployee = scheduledEmployee;
	}
	public List<Service> getScheduledServices() {
		return scheduledServices;
	}
	public void setScheduledServices(List<Service> scheduledServices) {
		this.scheduledServices = scheduledServices;
	}
	
	
	
	
}
