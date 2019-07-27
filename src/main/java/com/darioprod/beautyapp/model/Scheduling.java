package com.darioprod.beautyapp.model;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "scheduling")
public class Scheduling extends AbstractModel<Long> {

	private LocalDateTime schedulingDateTime;
	private Client scheduledClient;
	private Employee scheduledEmployee;
	//private List<Service> scheduledServices;	
	
	public LocalDateTime getSchedulingDateTime() {
		return schedulingDateTime;
	}
	public void setSchedulingDateTime(LocalDateTime schedulingDateTime) {
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
	/*public List<Service> getScheduledServices() {
		return scheduledServices;
	}
	public void setScheduledServices(List<Service> scheduledServices) {
		this.scheduledServices = scheduledServices;
	}*/
	
	
	
	
}
