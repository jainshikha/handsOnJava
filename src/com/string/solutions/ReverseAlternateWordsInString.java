package com.string.solutions;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * Write a program to reverse alternate words in a given string without using additional space.
 */
public class ReverseAlternateWordsInString {

	public static void main(String[] args) {
		String input = "I am Ashish Kharode";
		String output = reverse(input);
		System.out.println("Output: "+ output);
	}

	private static String reverse(String input) {
		String[] words = input.split(" ");
		for(int i=1; i<= words.length; i+=2) {
			words[i] = new StringBuilder(words[i]).reverse().toString();
		}
		return Stream.of(words).collect(Collectors.joining(" "));
	}

}
