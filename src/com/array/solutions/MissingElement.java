package com.array.solutions;

/*
 * Given an unsorted array of size n containing the integers 1 through n in random order with one 
 * element randomly replaced by 0, determine the missing element most efficiently.
 * 
 * Time: O(n) & Space: O(n)
 * 
 * Solution 2: use formula n(n+1)/2 to get sum of all numbers and then subtract total numbers from it.
 */
public class MissingElement {

	public static void main(String[] args) {
		int[] inputs = {2, 8, 0, 7, 3, 4, 6, 1};
		int output = missingElement(inputs);
		System.out.println("Missing Element: " + output);
	}

	private static int missingElement(int[] inputs) {
		int result = -1;
		boolean[] temp = new boolean[inputs.length];
		for(int input : inputs) {
			if (input != 0) {
				temp[input - 1] = true;
			}
		}
		for(int i=0; i<temp.length; i++) {
			if(!temp[i]) {
				result = i+1;
			}
		}
		return result;
	}

}
