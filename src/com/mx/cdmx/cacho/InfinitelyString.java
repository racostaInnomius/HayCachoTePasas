package com.mx.cdmx.cacho;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InfinitelyString {
	
	public static void main(String[] args) {
		//int i = 10;
		//cfimaakj
		//554045874191
		long res = repeatedString("aba", 10);
		System.out.println(res);
	}
	
	static long repeatedString(String s,double n) {
		System.out.println("********* s: "+ s);
		List<String> arrList 	= new ArrayList<String>(Arrays.asList(s.split("")));
		arrList.remove(0);
		long count = 0;
		int z = 0;
		if (arrList.size() < n) {
			int i = arrList.size();
			System.out.println("********* i: "+ i);
			for (int y = 0; y <= n; y++) {
				if (y == i) {
					y = 0;
				}
System.out.println("********* i: "+ arrList.get(y)+" - "+arrList.get(y).equals("a"));	
				if (arrList.get(y).equalsIgnoreCase("a")) {
					count ++;
				}
				z++;
				if (z == n) {
					return count;
				}
			}
			
		} else {
			for (int a = 0;a <= arrList.size();a++) {
				if (arrList.get(a).equalsIgnoreCase("a")) {
					count ++;
				} 
				if (a == n){
					return count;
				}
			}
		}
		return count;
	}
}
