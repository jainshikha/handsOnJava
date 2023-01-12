package com.company.solutions;

/*
 * Write a efficient program to get know how much profit one can get by stock buying and selling multiple times.
 * 
 * Input: {21, 10, 7, 5, 8, 11, 9, 4}
 * Output: 6
 */
public class StockTradingMultiTimes {

	public static void main(String[] args) {
		int[] stocks = {21, 10, 7, 5, 8, 11, 9, 4 };
		trading(stocks);
	}

	private static void trading(int[] stocks) {
		int profit = 0;
		for (int i = 1; i < stocks.length; i++) {
			if (stocks[i] > stocks[i - 1]) {
				profit += stocks[i] - stocks[i - 1];
			}
		}
		System.out.println("Max Profit: " + profit);
	}

}
