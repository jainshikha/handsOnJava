package com.company.solutions;

/*
 * Write a efficient program to get know which is best stock buying and selling price.
 * 
 * Input: {21, 10, 7, 5, 8, 11, 9, 4}
 * Output: Buy: 5 and Sell: 11
 */
public class StockTrading {

	public static void main(String[] args) {
		int[] stocks = {21, 10, 7, 5, 8, 11, 9, 4};
		trading(stocks);
	}

	private static void trading(int[] stocks) {
		int minPrice = 0;
		int maxPrice = 0;
		int max = 0;
		int min = stocks[0];
		
		for(int i=1; i<stocks.length; i++) {
			int diff = stocks[i] - min;
			if (diff > max) {
				maxPrice = stocks[i];
				minPrice = min;
				max = diff;
			}
			if (stocks[i] < min) {
				min = stocks[i];
			}
		}
		System.out.println("Buy: " + minPrice + " & Sell: " + maxPrice);
	}

}
