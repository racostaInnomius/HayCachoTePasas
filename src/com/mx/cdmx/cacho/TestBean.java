package com.mx.cdmx.cacho;

public class TestBean {
	
	String name, lastName;
	
	public TestBean(String name, String lastName) {
		this.name = name;
		this.lastName = lastName;
	}
	
	// hashcode tienes que impl el equals
	public int hashcode() {
		return 1;
	}

}
