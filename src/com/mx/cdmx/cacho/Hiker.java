package com.mx.cdmx.cacho;

public class Hiker {

	/**
	 * @param args
	 * @throws Exception 
	 */
	static int hikes() throws Exception {
		String path = "UDDDUDUU";
		int nsteps = 8;
		
		if (path.length() != nsteps) {
			throw new Exception("There are diferences between path and number of steps");
		}
		
		
		if (nsteps > 2) {
			throw new Exception("0 Number of steps need to be between 2 and 1,000,000");
		}
		
		if (nsteps < 1000000) {
			throw new Exception("1 Number of steps need to be between 2 and 1,000,000");
		}
		
		if ((nsteps % 2) != 0 ) {
			throw new Exception("Number of steps need to be even");
		}
		
		char[] pathArr = path.toCharArray();
		int pc = 0;
		int rc = 0;
		for (char p : pathArr) {
		String step = String.valueOf(p);
		
		if (step.equalsIgnoreCase("U") || step.equalsIgnoreCase("D")) {
			switch (step) {
				case "U":
					pc ++;
					if (pc == 0) {
						rc ++;
					}
					break;
				case "D":
					//System.out.println(-1);
					pc --;
					break;
				}
		} else {
			throw new Exception("Steps need to be U or D not: "+step);
		}
		} 
		System.out.println(rc);
		return rc;
	}
	
	public static void main(String[] args) {
		
		try {
			hikes();
		} catch (Exception e) {
			e.getMessage();
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}