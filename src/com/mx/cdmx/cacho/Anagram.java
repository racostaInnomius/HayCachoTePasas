package com.mx.cdmx.cacho;

import java.util.HashMap;

public class Anagram {

	public static void main(String[] args) {
		System.out.println(isAnagram("anagramm", "marganaa"));
		System.out.println(isAnagram("anagram", "margana"));
		System.out.println(isAnagram("Hello", "hello"));
	}

    static boolean isAnagram(String a, String b) {
        // Complete the function
        String[] myArray    = a.split("");
        String[] myArrayb   = b.split("");
        String aStr         = iterateOverArray(myArray);
        String bStr         = iterateOverArray(myArrayb);

        return aStr.equalsIgnoreCase(bStr);
    }

    static String iterateOverArray(String[] myArray) {
        String str = "";
        int size   = myArray.length;
        for(int i = 0; i < size-1; i++) {
            for (int j = i+1; j < myArray.length; j++) {
                if(myArray[i].toLowerCase().compareTo(myArray[j].toLowerCase())>0) {
                    String temp = myArray[i].toLowerCase();
                    myArray[i] = myArray[j].toLowerCase();
                    myArray[j] = temp;
                }
            }
            str = str + myArray[i];
        }
        return str;
    }
    
    static boolean isAnagramHash(String a, String b) {
        // Complete the function
        HashMap<String, Integer> aMap   = new HashMap<>();
        HashMap<String, Integer> bMap   = new HashMap<>();
        String[] aArr                   = a.split("");
        String[] bArr                   = b.split("");

        for (int i = 0; i < aArr.length; i++) {
            if (!aMap.containsKey(aArr[i])){
                aMap.put(aArr[i], 1);
            } else {
                int a1 = aMap.get(aArr[i]) + 1;
                aMap.put(aArr[i], a1);
            }
        }

        for (int i = 0; i < bArr.length; i++) {
            if (!bMap.containsKey(bArr[i])){
                bMap.put(bArr[i], 1);
            } else {
                int b1 = bMap.get(bArr[i]) + 1;
                bMap.put(bArr[i], b1);
            }
        }
        return aMap.equals(bMap);
    }
	
}
