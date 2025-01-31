package io.nayan.springCRUD.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class Book {
	
	private String id;
	private String name;
	private String type;
	private String description;
	private double price;
	
	
	public Book()
	{
	
	}
	
	public Book(String id,String name,String type, String description, double price)
	{
		this.id=id;
		this.name=name;
		this.type=type;
		this.description=description;
		this.price=price;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	

}
