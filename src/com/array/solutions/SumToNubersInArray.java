package com.array.solutions;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/*
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution and you may not use the same element twice.
 * 
 * Input:
 * nums = {2, 7, 8, 4, 3, 11, 15}, target = 9
 * 
 * Output = {0, 1}  
 * here nums[0] + nums[1] = 9
 */
public class SumToNubersInArray {

	public static void main(String[] args) {
		int[] inputs = {2, 7, 8, 4, 3, 11, 15};
		int target = 9;
		
		find(inputs, target);
	}

	private static void find(int[] inputs, int target) {
		int x = 0;
		int y = 0;
		Map<Integer, Integer> mapping = new HashMap<>();
		for(int i=0; i<inputs.length; i++) {
			if (inputs[i] < target) {
				mapping.put(inputs[i], i);
			}
		}
		for(Entry<Integer, Integer> entry : mapping.entrySet()) {
			int expectedSecondNbr = target - entry.getKey();
			Integer secondNbrIndex = mapping.get(expectedSecondNbr);
			if (secondNbrIndex != null) {
				x = entry.getValue();
				y = secondNbrIndex;
				break;
			}
		}
		System.out.println("[" + x + ", " + y + "]");
	}

}
