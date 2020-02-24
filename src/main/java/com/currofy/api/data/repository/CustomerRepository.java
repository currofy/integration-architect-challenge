package com.currofy.api.data.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.currofy.api.data.model.CustomerModel;

public interface CustomerRepository extends MongoRepository<CustomerModel, String> {

	List<CustomerModel> findAll();
	CustomerModel findByEmail(String email);
	
}
