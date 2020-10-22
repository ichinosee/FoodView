package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="food")
public class Food {
	@Id
	@Column(name="code")
	private Integer code;
	
	@Column(name="category_code")
	private Integer categoryCode;
	
	@Column(name="name")
	private String name;
	
	@Column(name="calorie")
	private Integer calorie;

	public Integer getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public Integer getCalorie() {
		return calorie;
	}



}
