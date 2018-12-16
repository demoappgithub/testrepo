package com.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "carwasher")
public class CarWasherProperties {
	private boolean dummyBooleanValue = false;

	public boolean isDummyBooleanValue() {
		return dummyBooleanValue;
	}

	public void setDummyBooleanValue(boolean dummyBooleanValue) {
		this.dummyBooleanValue = dummyBooleanValue;
	}

}
