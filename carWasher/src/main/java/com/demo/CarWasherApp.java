package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(value = CarWasherProperties.class)
public class CarWasherApp {

	public static void main(String[] args) {
		SpringApplication.run(CarWasherApp.class, args);
	}

}
