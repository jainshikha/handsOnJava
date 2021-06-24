package com.array.multi.solutions;

import java.util.Scanner;

/*
 * You are given a binary matrix of size N x N which represents the pixels of a logo.
 * 1 indicates that the pixel is colored and 0 indicates no color.
 * If colored pixels of the logo are symmetric about both X-axis and Y-axis, then the logo is symmetric.
 * 
 * Inputs:
 * case 1: Output: YES
 *01110
 *01010
 *10001
 *01010
 *01110
 *
 * case 2: Output: No
 *01110
 *01010
 *10001
 *01010
 *01111
 */
public class SymmenticPixel {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int size = Integer.parseInt(s.nextLine());
		String[][] matrix = new String[size][size];
		for (int i = 0; i < size; i++) {
			String binary = s.nextLine();
			matrix[i] = binary.split(" ");
		}

		String output = isSymmentic(matrix);
		System.out.println("Output: " + output);
	}

	private static String isSymmentic(String[][] matrix) {
		String result = "YES";
		int rowI = matrix.length - 1;
		outer: for (int row = 0; row <= matrix.length / 2; row++) {
			int colI = matrix.length - 1;
			for (int col = 0; col <= matrix.length / 2; col++) {
				if (!matrix[row][col].equals(matrix[row][colI]) || !matrix[row][col].equals(matrix[rowI][col])
						|| !matrix[rowI][col].equals(matrix[rowI][colI])) {
					result = "NO";
					break outer;
				}
				colI--;
			}
			rowI--;
		}
		return result;
	}

}
