package com.mx.cdmx.cacho.partnersample;

class Finalize {
	// the finalize() method will be called when the object is garbage collected (it takes time)
	public void finalize() {
		System.out.println("Finalize is called");
	}
	
	public static void main(String args[])
	{
		Finalize f1 = new Finalize();
		Finalize f2 = new Finalize();
		f1			= null;
		f2			= null;
		System.gc();
	}
}