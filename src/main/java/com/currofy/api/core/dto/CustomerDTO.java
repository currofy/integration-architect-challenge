package com.currofy.api.core.dto;

import java.util.List;

public class CustomerDTO {
	
	private String customerId;
	private String name;
	private String surname;
	private String email;
	private String address;
	private String phoneNumber;
	private String pass;
	private List<TicketDTO> tickets;
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public List<TicketDTO> getTickets() {
		return tickets;
	}
	public void setTickets(List<TicketDTO> tickets) {
		this.tickets = tickets;
	}
	
	
	
}
