package com.mx.cdmx.cacho.partnersample;

//we declare this class as final, no one can extend from this class
public final class Immutable {

	private String carName;

	Immutable(String name) {
		this.carName = name;
	}

	public String getName() {
		return carName;
	}

	//no setter

	public static void main(String[] args) {

		Immutable obj = new Immutable("Ferrari");
		System.out.println(obj.getName());

		// there is no way to update the Car's name after the object is created
		// because this object is immutable.
		// obj.setName("new Audi");
		// System.out.println(obj.getName());

	}
	
}
