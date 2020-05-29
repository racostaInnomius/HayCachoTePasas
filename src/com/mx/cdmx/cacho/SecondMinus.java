package com.mx.cdmx.cacho;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class SecondMinus {

	public static void main(String[] args) {
		/*
		int[] i = {0,8,7,9,67};
		Arrays.sort(i);
		System.out.println(i[1]);
		*/
		
		String[][] a = {{"Rodrigo", "6"},
						{"Javier","2"},
						{"Rodrigo", "3"},
						{"Lalo","4"},
						{"Antonio", "1"},
						{"zAntonio", "1"}};
		
		Arrays.sort(a, Comparator.comparing(c -> c[0]));
		System.out.println(Arrays.deepToString(a));
		
		
		
		Map<String,Integer> resMap = new HashMap<>();
		
		int count = 1;
		for (int c = 0; c < a.length; c++) {
			
			String[] line 	= a[c];
			String k 		= line[0];
			int v 			= Integer.parseInt(line[1]);
			
			if (c > 0 && k.equalsIgnoreCase(a[c-1][0])) {
				v 		= v + Integer.parseInt(a[c-1][1]);
				count 	= count + 1;
				System.out.println("0. v: "+v);
				System.out.println("0. count: "+count);
			} else {
				System.out.println("1. count: "+count);
				if (count > 1) {
					System.out.println("1. k: "+k+" v: "+v+" count: "+count);
					v = v/count;
					count = 1;
				}
				resMap.put(k, v);
			}
		}
		System.out.println(resMap);
	}
}
