package com.mx.cdmx.cacho;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FunctionalInterfaceExample {

	/*
	 * It is defined as an interface that contains only one abstract function or
	 * method. Functional interfaces can represent abstract concepts such as
	 * functions, actions or predicates.
	 * 
	 * Major functional interfaces are Predicate, Consumer, Function, Supplier,
	 * BinaryOperator, UnaryOperator
	 * 
	 */

	public static void main(String[] args) {
		// Predicate /////////////////////////////////////////////////////////////////
		// function to check whether a string length is less than 15
		// Represents a predicate (boolean-valued function) of one argument.
		// This is a functional interface whose functional method is test(Object).
		Predicate<String> checkCharLen = (string) -> string.length() < 15;
		Predicate<ArrayList<Integer>> checkInt = (intArr) -> {
							return intArr.contains(5);
						};
		List <Integer> listArray = new ArrayList<Integer>();
		listArray.add(2);
		listArray.add(5);
		listArray.add(6);
		System.out.println("0.1 "+checkInt.test((ArrayList<Integer>) listArray));
		System.out.println("1. "+checkCharLen.test("Schawrzenf"));
		//Output true
		System.out.println("2. "+checkCharLen.test("Schawrzenfdfsdfsdfsdfsfrtyrty"));
		//Output false
		
		//Consumer example uses accept method ///////////////////////////////////////
		//Represents an operation that accepts a single input argument and returns 
		//no result. Unlike most other functional interfaces, Consumer is expected 
		//to operate via side-effects.
		Consumer<String> consumerStr = (s) -> System.out.println(s.toUpperCase());
		consumerStr.accept("3. "+"sachin tendulkar");
		// output SACHIN TENDULKAR
		
		int ok = 5;
		FuncInterface funcIntOp = (o) -> o + 5;
		System.out.println("3.1. funcIntOp.doOperation(ok): "+funcIntOp.doOperation(ok));
		
		funcIntOp = FuncInterfaceImpl::doOperation100;
		System.out.println("3.2. funcIntOp.doOperation(ok): "+funcIntOp.doOperation(ok));
		
		funcIntOp = FuncInterfaceImpl::doOperation200;
		System.out.println("3.3. funcIntOp.doOperation(ok): "+funcIntOp.doOperation(ok));
		
		//Function /////////////////////////////////////////////////////////////////
		// Represents a function that accepts one argument and produces a result. prime
		// This is a functional interface whose functional method is apply(Object).
		Function<Integer,Integer> cubeofnumber = (num)-> num * num * num;
		System.out.println("4. "+"cube of 26 is : " + cubeofnumber.apply(26));
		//Output 17576
		
		//Supplier //////////////////////////////////////////////////////////////////
		// Represents a supplier of results.
		// There is no requirement that a new or distinct result be returned each time the supplier is invoked.
		// This is a functional interface whose functional method is get().
		Supplier<String> outputman  = ()-> "Rohit Sharma is an opening batsman";
		System.out.println("5. "+outputman.get());
		//output Rohit Sharma is an opening batsman
		
		//i want to generate a list of squares of number 
		//starting from two to a particular number
		Function<Integer,List<Integer>> getAllSquares = (num) -> 
								IntStream.rangeClosed(2, num)
								.map(i -> i * 2 )
								.boxed()
								.collect(Collectors.toList());
								
		System.out.println("6. "+getAllSquares.apply(13));
		// Output [4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26]
		
		// want to generate all prime numbers between 2 to entered number
		Function<Integer,List<Integer>> getAllPrimes = (num) -> 
								IntStream.rangeClosed(2, num)
								.filter(FunctionalInterfaceExample::isPrime)
								.boxed()
								.collect(Collectors.toList());
		System.out.println("7. "+"All prime numbers between 19 = "+getAllPrimes.apply(19));
		//output All prime numbers between 19 = [2, 3, 5, 7, 11, 13, 17, 19]
		
		//function to find sum of primes between 2 and a given number
		Function<Integer,Integer> getsumOfPrimes = (num) -> 
								IntStream.rangeClosed(2, num)
								.filter(FunctionalInterfaceExample::isPrime)
								.boxed()
								.mapToInt(i -> i)
								.sum();
		// here PredicateExample is my class name and isPrime is a static method to check whether a given number is prime or not
		System.out.println("8. "+"sum of primes  between 2 and  19 = "+getsumOfPrimes.apply(19));
		//output sum of primes  between 2 and  19 = 77
		
		// same using BinaryOperator functional interface
		BinaryOperator<Integer> sumOfAllPrimes = (a,b) -> 
								IntStream.rangeClosed(a, b)
								.filter(FunctionalInterfaceExample::isPrime)
								.boxed()
								.mapToInt(i ->i)
								.sum();
		System.out.println("9. "+"sum of all primes b/w using binary operator = "+sumOfAllPrimes.apply(2, 19));
		//sum of primes b/w between 2 and  19 = 77
	}
	
	public static boolean isPrime(int number) {
		return IntStream.rangeClosed(2, number/2).noneMatch(i -> number%i == 0);
	}
}
