package com.spring.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Stone")
public class Stone {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private double carat;
	private int quantity;
	private String description;

	public Stone() {
		
	}

	public Stone(int id, String name, double carat, int quantity, String description) {
		super();
		this.id = id;
		this.name = name;
		this.carat = carat;
		this.quantity = quantity;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCarat() {
		return carat;
	}

	public void setCarat(double carat) {
		this.carat = carat;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Stone [id=" + id + ", name=" + name + ", carat=" + carat + ", quantity=" + quantity + ", description="
				+ description + "]";
	}
	

}
