package com.test.viewer.carviewer.model;

import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "car")
public class Car {
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 @Column(name = "id_car")
	 private Long id_car;
	 @Column(name = "Name")
	 private String Name;
	 @Column(name = "Brand")
	 private String Brand;
	 @Column(name = "image")
	 private String image;
	 public Long getId() {
		return id_car;
	}
	public void setId(Long id) {
		this.id_car = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
	
}
