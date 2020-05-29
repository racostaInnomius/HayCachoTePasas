package com.mx.cdmx.cacho;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.IntStream;

class MyThread implements Runnable {

	String name;
	Thread t;

	MyThread (String threadname){
		name = threadname; 
		t = new Thread(this, name);
		System.out.println("New thread: " + t);
		t.start();
	}

	public void run() {

		try {
			for(int i = 5; i > 0; i--) {
				System.out.println(name + ": " + i);
				Thread.sleep(1000);
			}

		}catch (InterruptedException e) {
			System.out.println(name + "Interrupted");
		}
		System.out.println(name + " exiting.");
	}
}

class MultiThread {

	public static void main(String args[]) {

		new MyThread("One");

		new MyThread("Two");

		new MyThread("Three");

		try {

			Thread.sleep(10000);

		} catch (InterruptedException e) {
			System.out.println("Main thread Interrupted");
		}
		System.out.println("Main thread exiting.");
	}

}

class Example {
	public static void main(String args[]) {
		try {
			int a[]= new int[10];
			a[10]= 10/0;
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic exception in first catch block");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index out of bounds in second catch block");
		}
		catch(Exception e) {
			System.out.println("Any exception in third catch block");
		}
	}
}

class ExampleIntStream {
	
	public static void main(String args[]) {
		List<Integer> aList = new ArrayList<>();
		List<Integer> bList = new ArrayList<>();
		List<Integer> cList = new ArrayList<>();
		Integer[] a = new Integer[0]; 
		
		aList.add(0);
		bList.add(2);
		
		aList.add(1);
		bList.add(0);
		
		cList = Arrays.asList(a);
		
		/*
		aList.stream().map(a -> bList.stream().map(b -> {
			if (a > b) {
				
			}
		};
		))*/
		
	}
	
}