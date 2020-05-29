package com.mx.cdmx.cacho;

import java.util.Arrays;

public class RotateNumbers {

	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5};
		int d 	= 4;
		
		a = rotLeft(a, d);
		
		System.out.println(Arrays.toString(a));
		
	}
	
    // Complete the rotLeft function below.
    static int[] rotLeft(final int[] a, int d) {
    	
    	int[] b = a;
        for (int i = 0; i < d; i++) {
        	b = moveOne(b);
        }
        
        return b;
    }
    
    static int[] moveOne(int[] a){
        int[] b = new int[a.length];
        
        for (int l = a.length; 0 <= l; l--){
        	if (l > 0) {
	            if (l==1){
	                b[a.length-1] = a[l-1];
	            } else {
	                b[l-2] = a[l-1];
	            }
        	}
        }
        
        return b;
    }

}
