package com.dynamic.solutions;

/*
 * Find the minimum coins required for to make amount of 18 from given [7, 5, 1] coins.
 * 
 * Output: Minimum coins required: 4
 */
public class MinimumCoinsCount {

	public static void main(String[] args) {
		int amount = 18;
		int[] coins = {7, 5, 1};
		
		int result = minCoin(amount, coins);
		System.out.println("Minimum coins required: " + result);
	}

	private static int minCoin(int amount, int[] coins) {
		if (amount == 0) {
			return 0;
		}
		
		int min = Integer.MAX_VALUE;
		for(int i=0; i<coins.length; i++) {
			if (amount - coins[i] >= 0) {
				int minSub = minCoin(amount - coins[i], coins);
				if (min > minSub) {
					min = minSub;
				}
			}
		}
		return min + 1;
	}

}
