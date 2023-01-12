package com.string.solutions;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/*
 * Write a program to find first non-repeating char in an input string
 */
public class NonRepeatingChar {

	public static void main(String[] args) {
		String input = "swissa";
		char output = nonRepeating(input);
		System.out.println("Output: " + output);
	}

	private static char nonRepeating(String input) {
		char output = 0;
		Map<Character, Integer> mapping = new LinkedHashMap<>();
		for(Character c : input.toCharArray()) {
			Integer count = mapping.get(c);
			if (count == null) {
				mapping.put(c, 1);
			} else {
				mapping.put(c, ++count);
			}
		}
		for(Entry<Character, Integer> entry : mapping.entrySet()) {
			if (entry.getValue() == 1) {
				output = entry.getKey();
				break;
			}
		}
		return output;
	}

}
