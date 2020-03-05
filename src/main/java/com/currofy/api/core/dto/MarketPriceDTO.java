package com.currofy.api.core.dto;

import java.math.BigDecimal;

public class MarketPriceDTO {
	
	private String countryISOCode;
	private String currenry;
	private BigDecimal price;
	
	public String getCountryISOCode() {
		return countryISOCode;
	}
	public void setCountryISOCode(String countryISOCode) {
		this.countryISOCode = countryISOCode;
	}
	public String getCurrenry() {
		return currenry;
	}
	public void setCurrenry(String currenry) {
		this.currenry = currenry;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	

}
