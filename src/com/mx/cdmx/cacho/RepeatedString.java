package com.mx.cdmx.cacho;

public class RepeatedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s 	= "aba";
		long n 		= 10;
		long r 		= repeatedString(s, n);
		
		System.out.println("resp: "+r);
	}
	
	static long repeatedString(String s, long n) {
        int a 		= s.length();
        int c 		= s.length() - s.replaceAll("a","").length();
        Double b 	= new Double(n/a);
        System.out.println("n: "+n+" a: "+a+" c: "+ c +" (n/a): "+b);
        System.out.println("(n/a)*c: "+(b)*c);
        long r = Math.round((n/a)*c);

        return r;
	}

}
