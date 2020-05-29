package com.mx.cdmx.cacho;

/*
 * Polymorphism means "many forms", and it occurs when we have many 
 * classes that are related to each other by inheritance.
 * 
 * Inheritance lets us inherit attributes and methods from another class.
 * 
 * Abstraction: Abstraction is the methodology of hiding the 
 * implementation details from the user and only providing the functionality to the users. 
 * 
 * Encapsulation: Encapsulation in Java is a mechanism of wrapping up 
 * the data and code together as a single unit. 
 * Is to make sure that "sensitive" data is hidden from users.
 * . declare class variables/attributes as private (only accessible within the same class)
 * . provide public setter and getter methods to access and update the value of a private variable
 * 
 */

class Animal {
	String animalName = "animal";
	public void animalSound() {
		System.out.println("The animal makes a sound");
	}
}

class Pig extends Animal {
	public void animalSound() {
		System.out.println("The pig says: wee wee");
	}
}

class Dog extends Pig {
	public void animalSound() {
		System.out.println("The dog says: bow wow " + this.animalName);
	}
}

// Method Overriding
class Polymorphism {
	public static void main(String[] args) {
		Animal myAnimal = new Animal(); // Create a Animal object
		Animal myPig = new Pig(); // Create a Pig object
		Animal myDog = new Dog(); // Create a Dog object
		Pig p = new Dog();

		p.animalSound();
		System.out.println("-----------------");
		myAnimal.animalSound();
		myPig.animalSound();
		myDog.animalSound();
	}
}

// Method Overloading	
class Adder {
	static int add(int a, int b){
		return a+b;
	}
	
	static double add(double a, double b){
		return a+b;
	}
	
	public static void main(String args[]){
		System.out.println(Adder.add(11,11));
		System.out.println(Adder.add(12.3,12.6));
		
		//long l = 1000000000000000000L;
         
        //ArrayList<E> li LongStream.range(0, l).map(i -> i ).boxed().toArray(Collectors.toList());
        
        // Displaying the LongStream having single element 
        //stream.forEach(System.out::println); 	
	}
}

class Box<T> {
	private T t;

	public void add(T t) {
		this.t = t;
	}

	public T get() {
		return t;
	}

	public static void main(String[] args) {
		Box<Integer> integerBox = new Box<>();
		Box<String> stringBox = new Box<>();

		integerBox.add(new Integer(10));
		stringBox.add(new String("Hello World"));

		System.out.printf("Integer Value :%d\n\n", integerBox.get());
		System.out.printf("String Value :%s\n", stringBox.get());
	}
}
