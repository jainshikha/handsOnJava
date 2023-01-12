package com.string.solutions;

import com.sun.xml.internal.bind.v2.model.annotation.Quick;

/*
 * For given two string, need to check if other string is made up of chars using first one.
 */
public class TwoStringPermutation {

	public static void main(String[] args) {
		String one = "The Nightg";
		String two = "The Thinge";
		boolean output = permuatation(one, two);
		System.out.println("Output: " + output);
	}

	/*
	 * Here we need to ask interviewer some basic questions -
	 * 1. need to consider case sensitive chars like God is same as god ?
	 * 2. need to consider spaces also like "God  " is same as "god"?
	 */
	private static boolean permuatation(String one, String two) {
		if (one.length() != two.length()) {
			return false;
		}
		int[] mapping = new int[128];
		for(char c : one.toLowerCase().toCharArray()) {
			mapping[c]++;
		}
		for(char c : two.toLowerCase().toCharArray()) {
			mapping[c]--;
			if (mapping[c] < 0) {
				return false;
			}
		}
		return true;
	}

}
