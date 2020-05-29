package com.mx.cdmx.cacho;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Internationalization {

	public static void main(String[] args) {
		String word = "ko";
		String response = processWord(word);
		System.out.println(response);
	}

	private static String processWord(String word) {
		StringBuffer result 	= new StringBuffer();
		String[] wordArr		= word.split("");
		
	    List<String> evenIndexedNames = IntStream
	    	      .range(0, wordArr.length)
	    	      .filter(i -> i > 0 && i < wordArr.length-1)
	    	      .mapToObj(i -> wordArr[i])
	    	      .collect(Collectors.toList());
	    
		return result.append(wordArr[0])
				.append(evenIndexedNames.size())
				.append(wordArr[wordArr.length-1])
				.toString();
	}

}
