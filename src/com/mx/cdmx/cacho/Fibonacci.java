package com.mx.cdmx.cacho;

public class Fibonacci {

	public static void main(String[] args) {
		int n = 10;
		int res = fib(n);
		System.out.println(res);
	}

	private static int fib(int n) {
		if (n <= 1) {
			return n;
		}
		
		return fib(n-1)+fib(n-2);
	}
	
	private static int fibNoRec(int n) {
		
		if (n <= 1) {
			return n;
		}
		int n0 = 0;
		int n1 = 1;
		int res = 0;
		for (int i = 2; i <= n; i++) {
			res = n0 + n1;
			n0 = n1;
			n1 = res;
		}
		
		return res;
	}

}
