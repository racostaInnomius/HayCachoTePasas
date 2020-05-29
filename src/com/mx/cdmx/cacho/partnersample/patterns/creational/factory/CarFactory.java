package com.mx.cdmx.cacho.partnersample.patterns.creational.factory;

public class CarFactory {
	
	public Car getCar(String carType) {
        CarEnum cars = Enum.valueOf(CarEnum.class, carType);
        switch (cars) {
	        case FERRARI:
	        	return new Ferrari();
	        case AUDI:
	        	return new Audi();
			case BMW:
	        	return new Bmw();
	        default:
	        	return null;
        }
	}
}
