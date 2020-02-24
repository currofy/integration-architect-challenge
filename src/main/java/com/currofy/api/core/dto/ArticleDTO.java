package com.currofy.api.core.dto;

import java.util.List;

import lombok.Data;

@Data
public class ArticleDTO {
	
	private String name;
	private String description;
	private String internalId;
	private String size;
	private String color;
	private List<String> materials;
	private List<MarketPriceDTO> prices;
	private List<Integer> seasons;
	private List<String> photos;

}
