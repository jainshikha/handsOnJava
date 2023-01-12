package com.string.solutions;

/*
 * Write a program to check if two given string s1 and s2 are rotations of another.
 * Ex: if s1 = "IndiaUsaEngland" and s2 = "UsaEnglandIndia" then your program should
 * return true but if s2 = "IndiaEnglandUsa" then it should return false.
 */
public class StringRotation {

	public static void main(String[] args) {
		String s1 = "IndiaUsaEngland";
		String s2 = "UsaEnglandIndia";
		boolean output = isRoated(s1, s2);
		System.out.println("Output: " + output);
	}

	private static boolean isRoated(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		}
		String concat = s1 + s1;
		if(concat.indexOf(s2) != -1) {
			return true;
		}
		return false;
	}

}
