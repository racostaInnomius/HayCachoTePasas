package com.mx.cdmx.cacho.partnersample;

public class UniqueCharacter {
	public static void main(String args[]) {
		String uniqueChar = "$";
		String input = "kjhasdf sfdhsd $sdads asfasdf";
		boolean isPresent = input.contains(uniqueChar);
		
		System.out.println(isPresent);
	}
}
