package com.app.mongo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Item {
@Id
private String id;
private String description;
private Double price;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public Double getPrice() {
	return price;
}
public void setPrice(Double price) {
	this.price = price;
}
public Item(String id, String description, Double price) {
	super();
	this.id = id;
	this.description = description;
	this.price = price;
}
@Override
public String toString() {
	return "Item [id=" + id + ", description=" + description + ", price=" + price + "]";
}


}
