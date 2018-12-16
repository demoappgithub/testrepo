package com.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Car;
import com.demo.model.Driver;

@RestController
@RequestMapping(value = "/carWasherController")
public class CarWasherController {

	@RequestMapping("/cars")
	public List<Car> getCars() {
		List<Car> cars = new ArrayList<Car>();

		Driver driver1 = new Driver("WALTER", "WHITE", "1234", "USA");
		Driver driver2 = new Driver("JOHN", "SMITH", "5678", "LONDON");
		Driver driver3 = new Driver("JOHN", "CARTER", "1234", "ITALY");
		Driver driver4 = new Driver("WALTER2", "WHIT2E", "1234", "USA");

		Car car1 = new Car("FIAT", 2018, "RED", driver1);
		Car car2 = new Car("OPEL", 2017, "BLUE", driver2);
		Car car3 = new Car("WVT", 2016, "WHITE", driver3);
		Car car4 = new Car("CITROEN", 2010, "GRAY", driver4);

		cars.add(car1);
		cars.add(car2);
		cars.add(car3);
		cars.add(car4);

		return cars;
	}

	@RequestMapping("sayHello")
	public String sayHello() {
		return "hello";
	}
}
