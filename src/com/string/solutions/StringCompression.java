package com.string.solutions;

/*
 * Write a program to perform basic string compression using the counts of repeated chars.
 * Ex: the string "aabcccccaaa" would become "a2b1c5a3".
 * If compressed string would not become smaller than the original string, your method should return original string.
 */
public class StringCompression {

	public static void main(String[] args) {
		String input = "aabcccccaaa";
		String output = compress(input);
		System.out.println(output);
	}

	private static String compress(String input) {
		StringBuilder sb = new StringBuilder();
		int count = 1;
		for(int i=1; i<input.length(); i++) {
			if (i >= input.length()-1 || input.charAt(i-1) != input.charAt(i)) {
				sb.append(input.charAt(i-1)).append(count);
				count = 0;
			}
			count++;
		}
		String compress = sb.toString();
		if (compress.length() < input.length()) {
			return compress;
		}
		return input;
	}

}
