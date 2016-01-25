package com.zhang.factory;

public class Client1 {

	public static void main(String[] args) {
		Car by = CarFactory.createCar("by");
		Car bc = CarFactory.createCar("bc");
		
		by.run();
		bc.run();
	}

}
