package com.company.solutions;

/*
 * For given binary string, need to find number equivalent of it.
 * Than do following operations -
 * Even : divide by 2
 * Odd: minus 1
 * 
 * Output should be total number of operations on number.
 * 
 * Input: "0000011110"
 * Output: 8
 * Explanation: "0000011110" -> 30
 * 30 -> 30/2 = 15 (1)
 * 15 -> 15 - 1 = 14 (2)
 * 14 -> 14/2 = 7 (3)
 * 7 -> 7 - 1 = 6 (4)
 * 6 -> 6/2 = 3 (5)
 * 3 -> 3 - 1 = 2 (6)
 * 2 -> 2/2 = 1 (7)
 * 1 -> 1 - 1 = 0 (8)
 * 
 */
public class BinaryOperations {

	public static void main(String[] args) {
		String input = "0000011110";
		int result = solution(input);
		System.out.println("Total Operations: " + result);
	}

	private static int solution(String s) {
		if (s.isEmpty()) {
			return 0;
		}
		int totalOperations = 0;
		int numberOfOnes = 0;
		
		// step 1: find first '1' in string to avoid unnecessary 0s
		int nextOneIndex = s.indexOf('1');
		
		// step 2: calculate actual length by avoiding unnecessary 0s
		int actualLength = s.length() - nextOneIndex;
		
		// step 3: calculate how many 1s are in the string
		while(nextOneIndex != -1) {
			numberOfOnes++;
			nextOneIndex = s.indexOf('1', nextOneIndex+1);
		}
		
		// step 4: calculate operation where - ((length * 2) - numberOf0s - 1)
		totalOperations += (actualLength * 2) - (actualLength - numberOfOnes) - 1;
		return totalOperations;
	}
}
