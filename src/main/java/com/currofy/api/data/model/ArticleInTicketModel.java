package com.currofy.api.data.model;


import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "ticket-articles")
public class ArticleInTicketModel {

	private int number;
	private ArticleModel article;
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public ArticleModel getArticle() {
		return article;
	}
	public void setArticle(ArticleModel article) {
		this.article = article;
	}
	
	
	
}
