package com.demo.model;

import java.sql.Date;

public class CarWash {
	private Car car;
	private Date date;
	private float price;

	public CarWash() {
	}

	public CarWash(Car car, Date date, float price) {
		super();
		this.car = car;
		this.date = date;
		this.price = price;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

}
