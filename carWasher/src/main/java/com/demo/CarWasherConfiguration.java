package com.demo;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CarWasherConfiguration {

	@Autowired
	private CarWasherProperties carWasherProperties;

	@PostConstruct
	public void init() {
		System.out.println("dummyBooleanValue is " + carWasherProperties.isDummyBooleanValue());
	}
}
