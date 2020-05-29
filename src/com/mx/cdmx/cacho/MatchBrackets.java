package com.mx.cdmx.cacho;

import java.util.Stack;

public class MatchBrackets {

	public static void main(String[] arg) 
	{
		String test 			= "<{}>([[[]]])";
		Stack<String> strStack 	= new Stack<>();
		
		for (char a : test.toCharArray()) {
			String t = String.valueOf(a);
			switch (t) {
			case ")":
				if (strStack.peek().contains("(")) {
					strStack.pop();
				}
				break;
			case "}":
				if (strStack.peek().contains("{")) {
					strStack.pop();
				}
				break;
			case ">":
				if (strStack.peek().contains("<")) {
					strStack.pop();
				}
				break;
			case "]":
				if (strStack.peek().contains("[")) {
					strStack.pop();
				}
				break;
			default :
				strStack.push(t);
				break;	
			}
		}

		System.out.println("Is valid: "+ strStack.isEmpty());

	}

}
