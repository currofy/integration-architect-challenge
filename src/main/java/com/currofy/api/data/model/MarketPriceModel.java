package com.currofy.api.data.model;

import java.math.BigDecimal;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "markets")
public class MarketPriceModel {

	private String countryISOCode;
	private String currenry;
	private BigDecimal price;
	
}
