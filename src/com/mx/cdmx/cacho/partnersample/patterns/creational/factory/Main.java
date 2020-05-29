package com.mx.cdmx.cacho.partnersample.patterns.creational.factory;

public class Main {

	public static void main(String[] args) {
		CarFactory carFactory = new CarFactory();
		// Get a Ferrari
		Car ferrari = carFactory.getCar("FERRARI");
		ferrari.run();
		
		// Get a Bmw
		Car bmw = carFactory.getCar("BMW");
		bmw.run();
		
		// Get an Audi
		Car audi = carFactory.getCar("AUDI");
		audi.run();
	}
}
