package com.currofy.api.data.model;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "tickets")
public class TicketModel {

	@Id
	private String id;
	private List<ArticleInTicketModel> articles;
	private long generateDate;
	private BigDecimal totalPrice;
	private StoreModel store;
	private CustomerModel customer;
}
