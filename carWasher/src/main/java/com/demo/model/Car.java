package com.demo.model;

public class Car {
	private String model;
	private int year;
	private String color;
	private Driver driver;

	public Car() {
	}
	
	public Car(String model, int year, String color, Driver driver) {
		super();
		this.model = model;
		this.year = year;
		this.color = color;
		this.driver = driver;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

}
