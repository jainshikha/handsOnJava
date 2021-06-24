package com.search.solutions;

/*
 * Given two sorted arrays and a number x, find the pair whose sum is closest to x 
 * and pair has an elements from each array.
 * 
 * Input:
 * arr1 = {1, 4, 5, 7} and arr2 = {10, 20, 30, 40}; x = 32
 * 
 * Output: 1 and 30
 */
public class ClosestPair {

	public static void main(String[] args) {
		int[] arr1 = { 1, 4, 5, 7 };
		int[] arr2 = { 10, 20, 30, 40 };
		int x = 22;

		int indexL = 0, indexR = arr2.length - 1;
		int minDiff = Integer.MAX_VALUE;
		int pairOne = 0, pairTwo = 0;
		while (arr1.length > indexL && indexR >= 0) {
			int sum = arr1[indexL] + arr2[indexR];
			if (x < sum) {
				indexR--;
				continue;
			}
			int diff = Math.abs(x - sum);
			if (diff < minDiff) {
				minDiff = diff;
				pairOne = arr1[indexL];
				pairTwo = arr2[indexR];
			}
			indexL++;
		}
		System.out.println("Closest pair X: " + pairOne + ", Y: " + pairTwo);
	}

}
