package com.mx.cdmx.cacho.partnersample;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class SampleTest {

	public static void main(String[] args) {
		
		String input = "abcdffadc";
		String output = longestSubString(input);
		System.out.println(output);
		
		int[] arr = {2, 3, 4, 0, 5, 0, 9, 3};
		int[] outArr = arrangeCeros(arr);
		System.out.println(Arrays.toString(outArr));
		
		String input1 = "abcqscabcaama";
		String output1 = arrangeString(input1);
		System.out.println(output1);
	}

	
	private static String arrangeString(String str) {
		String[] myArray 	= str.split("");
		int size 			= myArray.length;
		StringBuilder sb 	= new StringBuilder();
		boolean isSameChar	= true;
		
		for(int i = 0; i < size-1; i++) {
			for (int j = i+1; j < myArray.length; j++) {
				if(myArray[i].equalsIgnoreCase(myArray[j])) {
					isSameChar = false;
					for (int k = j+1; k < myArray.length; k++) {
						String temp = myArray[j];
						myArray[j] = myArray[k];
						myArray[k] = temp;
					}
				}
			}
		}
		
		for (String s : myArray) {
			sb.append(s);
		}
		System.out.println(isSameChar);
		return sb.toString();
	}
	
	private static int[] arrangeCeros(int[] myArray) {
		int size = myArray.length;
		for(int i = 0; i < size-1; i++) {
			for (int j = i+1; j < myArray.length; j++) {
				if(myArray[i] == 0) {
					int temp = myArray[i];
					myArray[i] = myArray[j];
					myArray[j] = temp;
				}
			}
		}
		return myArray;
	}

	private static String longestSubString(String input) {
		String[] inputArr	= input.split("");
		StringBuilder sb 	= new StringBuilder();
		Set<String> setList	= new TreeSet<>();
		
		for (String in : inputArr) {
			setList.add(in);
		}
		setList.forEach(a -> sb.append(a));
		
		return sb.toString();
	}

}
