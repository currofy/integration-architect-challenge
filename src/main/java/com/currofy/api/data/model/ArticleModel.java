package com.currofy.api.data.model;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;


@Data
@Document(collection = "articles")
public class ArticleModel {

	private String name;
	private String description;
	private String internalId;
	private String size;
	private String color;
	private List<String> materials;
	private List<MarketPriceModel> prices;
	private List<Integer> seasons;
	private List<String> photos;
	
	
}
