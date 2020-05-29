package com.mx.cdmx.cacho;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class NewTestClass {
	
	   public static void main(String[] arg) 
	    {
		   String[] array = {"ate", "tae", "dog","iue"};
		   String str = "eat";
		   //String[] array = {"deed"};
		   //String str = "deee";
		   
		   List<String> anagramList = anagramV2(array, str);
		   
		   System.out.println("Result: "+anagramList);
		   
	    }
	   static List<String> anagramV2(String[] array, String str) {
		   Set<String> result = new TreeSet<>();
		   List<String> resultList = new ArrayList<>();
		   for (String s : array) {
			   if (s.length() == str.length()) {
				   
				   char[] charArr 	= str.toCharArray();
				   for (char c : charArr) {
					   result.add(String.valueOf(c));
				   }
			   }
			   StringBuffer sb = new StringBuffer();
			   for (String st : result) {
				   sb.append(st);
			   }
			   if (sb.toString().equalsIgnoreCase(str)) {
				   resultList.add(s);
			   }
		   }
		   return resultList;
	   }
	   
	   static List<String> anagram(String[] array, String str) {
		   List<String> strList = new ArrayList<>();
		   boolean isAnagram 	= false;
		   for (String s : array) {
			   if (s.length() == str.length()) {
				   char[] charArr 	= str.toCharArray();
				   for (char c : charArr) {
					   if (s.contains(String.valueOf(c))) {
						   isAnagram = true;
					   } else {
						   isAnagram = false;
					   }
				   }
			   }
			   if (isAnagram) {
				strList.add(s);   
			   }
		   }
		   return strList;
	   }
}
