package com.mx.cdmx.cacho;

public class Factorial {

	public static void main(String[] args) {
		int r = factorial(5);
		System.out.println(r);
	}

	public static int factorial(int n) {
		System.out.println(" n: "+n);
		if (n == 0) {
			return 1;
		} 
		int res = n*factorial(n-1);
		System.out.println("n: "+n+" res: "+res);
		return res;
	}
}
