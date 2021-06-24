package com.string.solutions;

import java.util.Scanner;

/*
 * Given a string, you need to tell whether it is a sumit's string or not.
 * a string is called Sumit's string, if distance between adjacent char is 1.
 * 
 * consider that alphabets are arranged in cyclic manner from 'a' to 'z'.
 * 
 * Print 'YES' if it is sumit's string else print 'NO'.
 * 
 * Input: 
 * 3
 * aba
 * zza
 * bcd
 * 
 * Output:
 * YES
 * NO
 * YES
 */
public class SumitsString {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int cases = Integer.parseInt(s.nextLine());
		String[] inputs = new String[cases];
		for(int i=0; i<cases; i++) {
			inputs[i] = s.nextLine();
		}
		
		for(String input : inputs) {
			String output = isSumitsString(input);
			System.out.println(output);
		}
	}

	private static String isSumitsString(String input) {
		for(int i=1; i<input.length(); i++) {
			int diff = Math.abs(input.charAt(i) - input.charAt(i-1));
			if (diff != 1 && diff != 25) {
				return "NO";
			}
		}
		return "YES";
	}

}
