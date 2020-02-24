package com.currofy.api.data.model;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "stores")
public class StoreModel {
	
	double lon;
	double lat;
	String commercialArea;
	String name;
	String storeId;
	BigDecimal salesEstimated;
	List<String> sections;

}
