package com.string.solutions;

/*
 * Write a program to convert string into number without using Integer.parseInt() method.
 */
public class ConvertStringToInteger {

	public static void main(String[] args) {
		int result = convert("5439");
		System.out.println(result);
	}

	private static int convert(String string) {
		int result = 0;
		int factor = 1;
		
		for(int i=string.length()-1; i>=0; i--) {
			result += (string.charAt(i) - '0') * factor;
			factor *= 10;
		}
		return result;
	}

}
