package com.mx.cdmx.cacho;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String args[]) 
    { 
    	int[] arr= {1,2,4,4,8,9,5};
    	int tar = 14;
    	boolean is = isTheSumPresent(arr, tar);
    	
    	System.out.println(is);
    } 
    
    public static boolean isTheSumPresent(int[] array, int target) {
    	Set<Integer> complementSet = new HashSet<>();
    	
    	for (int a : array){
    		if (complementSet.contains(a)) {
    			return true;
    		}
    		complementSet.add(Math.abs(a - target));
    	}
    	
    	return false;
    }
}
