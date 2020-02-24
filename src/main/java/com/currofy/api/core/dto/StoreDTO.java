package com.currofy.api.core.dto;

import java.math.BigDecimal;
import java.util.List;

import lombok.Data;

@Data
public class StoreDTO {

	double lon;
	double lat;
	String commercialArea;
	String name;
	String storeId;
	BigDecimal salesEstimated;
	List<String> sections;
	
}
