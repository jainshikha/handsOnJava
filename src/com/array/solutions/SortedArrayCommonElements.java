package com.array.solutions;
 /*
  * For given sorted arrays, print common elements between them.
  */
public class SortedArrayCommonElements {

	public static void main(String[] args) {
		int[] a = {1, 3, 4, 7};
		int[] b = {1, 2, 3, 4, 5, 6, 7, 8};
		printCommon(a, b);
	}

	private static void printCommon(int[] a, int[] b) {
		int aIndex = 0;
		int bIndex = 0;
		
		while(aIndex < a.length && bIndex < b.length) {
			if (a[aIndex] == b[bIndex]) {
				System.out.print(a[aIndex] + " ");
				aIndex++;
				bIndex++;
			} else if (a[aIndex] > b[bIndex]) {
				bIndex++;
			} else {
				aIndex++;
			}
		}
	}

}
