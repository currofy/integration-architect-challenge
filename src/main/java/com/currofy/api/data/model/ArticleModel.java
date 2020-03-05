package com.currofy.api.data.model;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;


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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getInternalId() {
		return internalId;
	}
	public void setInternalId(String internalId) {
		this.internalId = internalId;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public List<String> getMaterials() {
		return materials;
	}
	public void setMaterials(List<String> materials) {
		this.materials = materials;
	}
	public List<MarketPriceModel> getPrices() {
		return prices;
	}
	public void setPrices(List<MarketPriceModel> prices) {
		this.prices = prices;
	}
	public List<Integer> getSeasons() {
		return seasons;
	}
	public void setSeasons(List<Integer> seasons) {
		this.seasons = seasons;
	}
	public List<String> getPhotos() {
		return photos;
	}
	public void setPhotos(List<String> photos) {
		this.photos = photos;
	}
	
	
}
