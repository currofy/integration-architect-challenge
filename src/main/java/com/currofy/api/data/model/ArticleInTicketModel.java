package com.currofy.api.data.model;


import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "ticket-articles")
public class ArticleInTicketModel {

	private int number;
	private ArticleModel article;
	
}
