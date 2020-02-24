package com.currofy.api.core.dto;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class MarketPriceDTO {
	
	private String countryISOCode;
	private String currenry;
	private BigDecimal price;

}
