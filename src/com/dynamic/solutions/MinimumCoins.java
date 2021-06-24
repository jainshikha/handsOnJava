package com.dynamic.solutions;

/*
 * Find the minimum coins required for to make amount of 18 from given [7, 5, 1] coins.
 * Note: use dynamic programming to improve time complexity
 * 
 * Output: Minimum coins: 7*1 5*2 1*1
 * 
 * Time O(n) & Space O(n) where n is amount
 */
public class MinimumCoins {

	public static void main(String[] args) {
		int amount = 18;
		int[] coins = { 7, 5, 1 };
		Basket[] cache = new Basket[amount + 1];
		Basket output = minCoin(amount, coins, cache);
		System.out.println("Minimum coins: 7*" + output.coins[0] + " 5*" + output.coins[1] + " 1*" + output.coins[2]);
	}

	private static Basket minCoin(int amount, int[] coins, Basket[] cache) {
		if (amount == 0) {
			return new Basket();
		}
		Basket minB = null;
		Basket subMin = null;
		int minCount = Integer.MAX_VALUE;
		for(int i=0; i<coins.length; i++) {
			int amountToPass = amount - coins[i];
			if(amountToPass >= 0) {
				if(cache[amountToPass] != null) {
					subMin = cache[amountToPass];
				} else {
					subMin = minCoin(amountToPass, coins, cache);
				}
				if (subMin.countCoins() < minCount) {
					minCount = subMin.countCoins();
					minB = subMin.clone();
					minB.addCoin(coins[i]);
				}
			}
		}
		cache[amount] = minB;
		return minB;
	}

	static class Basket implements Cloneable {
		int[] coins = new int[3];

		public int countCoins() {
			return coins[0] + coins[1] + coins[2];
		}

		public void addCoin(int coin) {
			if (coin == 7) {
				coins[0]++;
			} else if (coin == 5) {
				coins[1]++;
			} else {
				coins[2]++;
			}
		}
		
		public Basket clone() {
			Basket b = new Basket();
			b.coins[0] = coins[0];
			b.coins[1] = coins[1];
			b.coins[2] = coins[2];
			return b;
		}

		@Override
		public String toString() {
			return "Basket [coins=" + countCoins() + "]";
		}
	}
}
