package com.company.solutions;

/*
 * For a given array, find a sub-array for which addition of elements is maximum.\
 * 
 * Input: inputs = {-1, 3, 4, -2, 5, 3, -1, 2, -8, 9, -5, 1, -6}
 * 
 * Output: 15
 * As sub-array: 3 + 4 -2 + 5 + 3 -1 + 2 -8 + 9= 15
 */
public class SubArrayAddition {

	public static void main(String[] args) {
		int[] inputs = {-1, 3, 4, -2, 5, 3, -1, 2, -8, 9, -5, 1, -6};
		int output = maxSubArraySum(inputs);
		System.out.println("Result: " + output);
	}

	static int maxSubArraySum(int a[]) {
		int size = a.length;
		int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;

		for (int i = 0; i < size; i++) {
			max_ending_here = max_ending_here + a[i];
			if (max_so_far < max_ending_here)
				max_so_far = max_ending_here;
			if (max_ending_here < 0)
				max_ending_here = 0;
		}
		return max_so_far;
	}

}
