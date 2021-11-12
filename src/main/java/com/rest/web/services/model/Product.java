package com.rest.web.services.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Product")
public class Product {

	private int id;
	private String description;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
