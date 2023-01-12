package com.array.solutions;

/*
 * Given a sorted array of size n with n elements and a sorted array of size 2n with n elements,
 * merge them to get a sorted array of size 2nd.
 * Do this in linear time and in-place.
 * 
 * Input:
 * array1 = {1, 3, 6}
 * array2 = {2, 4, 5, _, _, _}
 * 
 * Output:
 * {1, 2, 3, 4, 5, 6}
 */
public class SortTwoArray {

	public static void main(String[] args) {
		int[] a = {1, 3, 6};
		int[] b = {2, 4, 5, 0, 0, 0};
		int[] output = merge(a, b);
		for(int i : output) {
			System.out.print(i + " ");
		}
	}

	private static int[] merge(int[] a, int[] b) {
		int pointer = b.length;
		int bIndex = b.length - a.length -1;
		int aIndex = a.length -1;
		while(aIndex >= 0 && bIndex >=0) {
			pointer--;
			if (a[aIndex] > b[bIndex]) {
				b[pointer] = a[aIndex];
				aIndex--;
			} else {
				b[pointer] = b[bIndex];
				bIndex--;
			}
		}
		while(aIndex >= 0) {
			pointer--;
			b[pointer] = a[aIndex];
			aIndex--;
		}
		return b;
	}

}
