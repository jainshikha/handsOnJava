package com.string.solutions;

/*
 * Write a program, where characters is represented by charge and charges have a property of killing each other,
 * if they are of same charge and next to each other.
 * 
 * Output a final string followed by string afther which no neutralizing is possible.
 * 
 * Input: aaacccbbcccd
 * Output: ad
 */
public class NeutralizingLetters {

	public static void main(String[] args) {
		String input = "aaacccbbcccd";
		String output = neutralize(input);
		System.out.println("Output: " + output);
	}

	private static String neutralize(String input) {
		StringBuilder sb = new StringBuilder();
		int sbLength = 0;

		for (int i = 0; i < input.length(); i++) {
			sbLength = sb.length();
			if (sbLength != 0 && sb.charAt(sbLength - 1) == input.charAt(i)) {
				sb.deleteCharAt(sbLength - 1);
			} else {
				sb.append(input.charAt(i));
			}
		}
		return sb.toString();
	}

}
