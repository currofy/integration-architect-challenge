package com.currofy.api.core.dto;

import java.util.List;

import lombok.Data;

@Data
public class CustomerDTO {
	
	private String customerId;
	private String name;
	private String surname;
	private String email;
	private String address;
	private String phoneNumber;
	private String pass;
	private List<TicketDTO> tickets;
	
}
