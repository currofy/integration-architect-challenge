package com.currofy.api.data.model;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "tickets")
public class TicketModel {

	@Id
	private String id;
	private List<ArticleInTicketModel> articles;
	private long generateDate;
	private BigDecimal totalPrice;
	private StoreModel store;
	private CustomerModel customer;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public List<ArticleInTicketModel> getArticles() {
		return articles;
	}
	public void setArticles(List<ArticleInTicketModel> articles) {
		this.articles = articles;
	}
	public long getGenerateDate() {
		return generateDate;
	}
	public void setGenerateDate(long generateDate) {
		this.generateDate = generateDate;
	}
	public BigDecimal getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
	}
	public StoreModel getStore() {
		return store;
	}
	public void setStore(StoreModel store) {
		this.store = store;
	}
	public CustomerModel getCustomer() {
		return customer;
	}
	public void setCustomer(CustomerModel customer) {
		this.customer = customer;
	}
	
}
