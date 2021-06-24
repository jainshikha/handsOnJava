package com.string.solutions;

/*
 * Check if a String is a Palindrome or not.
 * A palindrome string is one whose reverse is also same string.
 * 
 * Approach 1:
 * we can use string builder and reverse the input string and check if both strings are equal for this.
 * 
 * Approach 2:
 * use the String charAt(int index) method to check.
 */
public class PalindromeString {

	public static void main(String[] args) {
		String input = "abcdedcba";
		boolean output = isPalindrome(input);
		System.out.println("Output: " + output);
	}

	private static boolean isPalindrome(String input) {
		String request = input.toLowerCase();
		for(int i=0; i<request.length()/2; i++) {
			if (request.charAt(i) != request.charAt(request.length()-1-i)) {
				return false;
			}
		}
		return true;
	}

}
