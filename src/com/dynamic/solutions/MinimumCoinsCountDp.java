package com.dynamic.solutions;

import java.util.Arrays;

/*
 * Find the minimum coins required for to make amount of 18 from given [7, 5, 1] coins.
 * Note: use dynamic programming to improve time complexity
 * 
 * Output: Minimum coins required: 4
 */
public class MinimumCoinsCountDp {

	public static void main(String[] args) {
		int amount = 18;
		int[] coins = {7, 5, 1};
		int[] cache = new int[amount + 1];
		Arrays.fill(cache, -1);
		
		int result = minCoin(amount, coins, cache);
		System.out.println("Minimum coins required: " + result);
		
		System.out.println("Cache: ");
		for(int i : cache) {
			System.out.print(i + " ");
		}
	}

	private static int minCoin(int amount, int[] coins, int[] cache) {
		if (amount == 0) {
			return 0;
		}
		
		int min = Integer.MAX_VALUE;
		for(int i=0; i<coins.length; i++) {
			int amountToPass = amount - coins[i];
			if (amountToPass >= 0) {
				int subMin = 0;
				if (cache[amountToPass] != -1) {
					subMin = cache[amountToPass];
				} else {
					subMin = minCoin(amountToPass, coins, cache);
				}
				if (min > subMin) {
					min = subMin;
				}
			}
		}
		cache[amount] = min + 1;
		return min + 1;
	}

}
