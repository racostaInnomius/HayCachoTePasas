package com.mx.cdmx.cacho.partnersample;

public class Mutable {

	private String carName;

	Mutable(String name) {
		this.carName = name;
	}

	public String getName() {
		return carName;
	}

	// this setter can modify the name
	public void setName(String name) {
		this.carName = name;
	}

	public static void main(String[] args) {

		Mutable obj = new Mutable("Ferrari");
		System.out.println(obj.getName());

		// update the Car's name, because this object is mutable
		obj.setName("new Audi");
		System.out.println(obj.getName());
	}
}
