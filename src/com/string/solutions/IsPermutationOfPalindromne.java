package com.string.solutions;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/*
 * Given a String, write a program to check if it is a permutation of palindrome.
 * Palindrome does not limited to dictionary words
 * 
 * Input: tact cao
 * Output: True (explanation: possible permutations are - "tacocat", "atc o cta", etc)
 */
public class IsPermutationOfPalindromne {

	public static void main(String[] args) {
		boolean result = check("tact cao");
		System.out.println("Result:" + result);
	}

	private static boolean check(String string) {
		boolean result = true;
		Map<Character, Integer> mapping = new HashMap<>();
		for (Character c : string.toCharArray()) {
			if (c == ' ') {
				continue;
			}
			Integer count = mapping.get(c);
			if (count == null) {
				mapping.put(c, 1);
			} else {
				mapping.put(c, ++count);
			}
		}

		boolean flag = false;
		for (Entry<Character, Integer> entry : mapping.entrySet()) {
			if (entry.getValue() % 2 == 1) {
				if (flag) {
					result = false;
					break;
				}
				flag = true;
			}
		}
		return result;
	}

}
