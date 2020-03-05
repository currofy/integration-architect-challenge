package com.currofy.api.core.dto;

import java.math.BigDecimal;
import java.util.List;

public class StoreDTO {

	double lon;
	double lat;
	String commercialArea;
	String name;
	String storeId;
	BigDecimal salesEstimated;
	List<String> sections;
	public double getLon() {
		return lon;
	}
	public void setLon(double lon) {
		this.lon = lon;
	}
	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
	public String getCommercialArea() {
		return commercialArea;
	}
	public void setCommercialArea(String commercialArea) {
		this.commercialArea = commercialArea;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStoreId() {
		return storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}
	public BigDecimal getSalesEstimated() {
		return salesEstimated;
	}
	public void setSalesEstimated(BigDecimal salesEstimated) {
		this.salesEstimated = salesEstimated;
	}
	public List<String> getSections() {
		return sections;
	}
	public void setSections(List<String> sections) {
		this.sections = sections;
	}
	
}
