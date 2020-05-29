package com.mx.cdmx.cacho;

public class Clouds {

	static int jumping(int[] cArr) throws Exception {
		
		if (cArr.length < 2 || cArr.length > 100) {
			throw new Exception();
		}
		
		int nc 	= cArr.length -1;
		int j	= 0;
		
		if (cArr[j] != 0 && cArr[nc] != 0) {
			throw new Exception();
		}
		if (nc != 1) {
		
			for (int a = 2 ; a <= nc ; ) {
				
				if (cArr[a] > 1) {
					throw new Exception();
				}
				
				if(cArr[a] == 0) {
					j++;System.out.println("0 j: "+j+" a: "+a);
				} else if (cArr[a-1] == 0){
					a=a-1;
					j++;System.out.println("1 j: "+j+" a: "+a);
				}  
				
				if ((a+1) == nc) {
					a=a+1;
				} else {
					a=a+2;
				}
			}
		} else {
			j = 1;
		}
		return j;
	}
	
	public static void main(String[] args) {
		
		int[] in = {0,0};
		try {
			int res = jumping(in);
			System.out.println("res: "+res);
		} catch (Exception e) {
			e.getMessage();
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
