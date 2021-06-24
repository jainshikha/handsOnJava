package com.company.solutions;

/*
 * for a given String, '|' - represent opening and closing of compartments and 
 * '*' - represent starts.
 * Need to count stars in given substring of provided string.
 * 
 * Input: *|**|*|***|*****
 * start = [1, 5]
 * end = [14, 11]
 * Note: input index stars with 1.
 * 
 * Output: 10
 * Explanation: for [1, 14] - means index 0 to 13, substring is '*|**|*|***|***'.
 * Here there are 3 compartments which has total 6 stars.
 * 
 * for [5, 11] - means index 4 to 10, substring is '|*|***|'
 * Here there are 2 compartments which has total 4 stars.
 *  6 + 4 = 10 stars
 */
public class CountStartsInCompartment {

	public static void main(String[] args) {
		String input = "*|**|*|***|*****";
		int[] start = {1, 5};
		int[] end = {14, 11};
		
		int count = countStars(input, start, end);
		System.out.println("Total stars: " + count);
	}

	private static int countStars(String input, int[] start, int[] end) {
		int totalStars = 0;
		for(int i=0; i<start.length; i++) {
			totalStars += count(input, start[i] - 1, end[i] - 1);
		}
		return totalStars;
	}

	private static int count(String input, int start, int end) {
		int countStars = 0;
		int compartmentIndex = input.indexOf('|', start);
		while (compartmentIndex != -1) {
			int endIndex = getNextIndex(input, compartmentIndex+1);
			if (endIndex != -1) {
				countStars += (endIndex - compartmentIndex) - 1;
			}
			compartmentIndex = endIndex;
		}
		return countStars;
	}

	private static int getNextIndex(String input, int start) {
		return input.indexOf('|', start);
	}
}
