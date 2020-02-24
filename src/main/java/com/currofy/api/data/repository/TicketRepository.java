package com.currofy.api.data.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.currofy.api.data.model.TicketModel;

public interface TicketRepository extends MongoRepository<TicketModel, String>{
	List<TicketModel> findByCustomerEmail(String email);
}
