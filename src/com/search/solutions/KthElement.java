package com.search.solutions;

import java.util.PriorityQueue;

/*
 * Given an array and number K where K is smaller than size of array.
 * We need to find the Kth smallest element in the given array.
 * It is given that all array elements are distinct.
 * 
 * Input: 
 * arr = {7, 10, 4, 3, 20, 15}
 * K = 3
 * 
 * Output: 7
 * 
 * Time: 
 */
public class KthElement {

	public static void main(String[] args) {
		int[] inputs = { 7, 10, 4, 3, 20, 15 };
		int k = 3;
		int output = find(inputs, k);
		System.out.println(k + "th element is: " + output);
	}

	private static int find(int[] inputs, int k) {
		PriorityQueue<Integer> queue = new PriorityQueue<>(inputs.length);
		for (int i : inputs) {
			queue.add(i);
		}
		while (k > 1) {
			queue.poll();
			k--;
		}
		return queue.poll();
	}

}
