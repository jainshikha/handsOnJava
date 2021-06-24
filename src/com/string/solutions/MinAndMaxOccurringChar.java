package com.string.solutions;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/*
 * Write a program to find out the maximum and minimum occurring character in the given string
 */
public class MinAndMaxOccurringChar {

	public static void main(String[] args) {
		String input = "Grass is greener on the other side of edge device";
		print(input);
	}

	private static void print(String input) {
		Map<Character, Integer> mapping = new HashMap<>();
		for(Character c : input.toLowerCase().toCharArray()) {
			Integer count = mapping.get(c);
			if (count == null) {
				mapping.put(c, 1);
			} else {
				mapping.put(c, ++count);
			}
		}
		
		Entry<Character, Integer> minimum = null;
		Entry<Character, Integer> maximum = null;
		for(Entry<Character, Integer> entry : mapping.entrySet()) {
			if (minimum == null || entry.getValue() < minimum.getValue()) {
				minimum = entry;
			}
			if (maximum == null || entry.getValue() > maximum.getValue()) {
				maximum = entry;
			}
		}
		
		System.out.println("Maximum: " + maximum.getKey() + " | count: " + maximum.getValue());
		System.out.println("Minimum: " + minimum.getKey() + " | count: " + minimum.getValue());
	}

}
