package com.array.solutions;

/*
 * You are given an array A of length N and output the total number of beautiful segments in given array.
 * Beautiful segment is a contiguous subarray of odd length L (L >= 3) of an array, such that the sequence of numbers
 * from first element (inclusive) to middle element (inclusive) is non decreasing and the sequence of numbers from 
 * middle element (inclusive) to last element (inclusive) is strictly decreasing.
 * Ex: "1 2 3 3 0 -1 -2", "1 2 3 2 1" are beautiful segments but "1 2 3 3 5", "1 2 3 3 3" are not.
 * 
 *  Input:
 *  1 2 1 2 1
 *  
 *  Output:
 *  2
 */
public class BeautifulSegments {

	public static void main(String[] args) {
		int[] inputs = {1, 2, 1, 2, 1};
		int count = beautifulSegments(inputs);
		System.out.println("Output: " + count);
	}

	private static int beautifulSegments(int[] inputs) {
		int count = 0;
		if (inputs.length < 3) {
			return 0;
		}
		for(int i=0; i<inputs.length-2; i++) {
			boolean asc = false;
			for(int j=i; j<inputs.length-1; j++) {
				if (inputs[j] < inputs[j+1]) {
					asc = true;
					continue;
				} else if (asc && inputs[j] > inputs[j+1]) {
					count++;
					break;
				} else if (inputs[j] > inputs[j+1]) {
					break;
				}
			}
		}
		return count;
	}

}
