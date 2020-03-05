package com.currofy.api.core.dto;

import java.math.BigDecimal;
import java.util.List;

public class TicketDTO {
	
	private String ticketId;
	private List<ArticleInTicketDTO> articles;
	private long generateDate;
	private BigDecimal totalPrice;
	private StoreDTO store;
	
	public String getTicketId() {
		return ticketId;
	}
	public void setTicketId(String ticketId) {
		this.ticketId = ticketId;
	}
	public List<ArticleInTicketDTO> getArticles() {
		return articles;
	}
	public void setArticles(List<ArticleInTicketDTO> articles) {
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
	public StoreDTO getStore() {
		return store;
	}
	public void setStore(StoreDTO store) {
		this.store = store;
	}
	
	
	
}
