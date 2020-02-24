package com.currofy.api.data.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "customers")
public class CustomerModel {

	@Id
	private String id;
	private String name;
	private String surname;
	private String email;
	private String address;
	private String phoneNumber;
	
	
}
