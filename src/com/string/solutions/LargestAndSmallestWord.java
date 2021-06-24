package com.string.solutions;

/*
 * Write a program to find smallest and largest word present in the string.
 */
public class LargestAndSmallestWord {

	public static void main(String[] args) {
		String input = "Hardships often perpare ordinary people for an extraordinary destiny";
		print(input);
	}

	private static void print(String input) {
		String smallest = null;
		String longest = null;
		
		for(String word : input.split(" ")) {
			if (smallest == null || word.length() < smallest.length()) {
				smallest = word;
			}
			if (longest == null || word.length() > longest.length()) {
				longest = word;
			}
		}
		
		System.out.println("Smallest: " + smallest);
		System.out.println("Longest: " + longest);
	}

}
