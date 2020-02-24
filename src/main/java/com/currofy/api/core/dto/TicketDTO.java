package com.currofy.api.core.dto;

import java.math.BigDecimal;
import java.util.List;

import lombok.Data;

@Data
public class TicketDTO {
	
	private String ticketId;
	private List<ArticleInTicketDTO> articles;
	private long generateDate;
	private BigDecimal totalPrice;
	private StoreDTO store;
	
}
