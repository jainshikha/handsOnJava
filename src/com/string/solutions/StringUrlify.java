package com.string.solutions;

/*
 * Write a program to replace all spaces in a string with '%20'.
 * you may assume that the string has sufficient space at the end to hold the additional chars 
 * and that you are given the true length of the string
 * 
 * Input: "Mr John Smith    ", 13
 * Output: "Mr%20John%20Smith"
 */
public class StringUrlify {

	public static void main(String[] args) {
		String input = "Mr John Smith    ";
		String output = convert(input, 13);
		System.out.println("URLify: " + output);
	}

	/*
	 * The algo employs two-scan approach.
	 * In first, we can find number of spaces.
	 * In second, which we can done in reverse order, we actually edit the string
	 */
	private static String convert(String input, int trueLength) {
		int spaces = 0;
		char[] chars = input.toCharArray();
		// 1st Step
		for(int i=0; i<trueLength-1; i++) {
			if (chars[i] == ' ') {
				spaces++;
			}
		}
		
		//2nd Step
		int finalLength = trueLength + (spaces * 2);
		if (finalLength != input.length()) {
			return "Can not Urlify given string";
		}
		for(int i = trueLength-1; i>= 0; i--) {
			if (chars[i] == ' ') {
				chars[--finalLength] = '0';
				chars[--finalLength] = '2';
				chars[--finalLength] = '%';
			} else {
				chars[--finalLength] = chars[i];
			}
		}
		return new String(chars);
	}

}
