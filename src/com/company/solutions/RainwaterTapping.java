package com.company.solutions;

/*
 * For given block of buildings, find out how much blocks of water can be tapped,
 * if there is a rain over buildings.
 * 
 * Input: buildings = {3, 1, 2, 4, 0, 1, 3, 2}
 * Output: Water blocks = 8
 */
public class RainwaterTapping {

	public static void main(String[] args) {
		int[] buildings = {3, 1, 2, 4, 0, 1, 3, 2};
		int result = waterTapping(buildings);
		System.out.println("Water Blocks: " + result);
	}

	private static int waterTapping(int[] buildings) {
		int waterBlocks = 0;
		int buildingsLenght = buildings.length-1;
		int[] left = new int[buildings.length];
		int[] right = new int[buildings.length];
		
		left[0] = buildings[0];
		for(int i=1; i<=buildingsLenght; i++) {
			left[i] = Math.max(left[i-1], buildings[i]);
		}
		
		right[buildingsLenght] = buildings[buildingsLenght];
		for(int i=buildingsLenght-1; i>=0; i--) {
			right[i] = Math.max(right[i+1], buildings[i]);
		}
		
		for(int i=0; i<= buildingsLenght; i++) {
			int min = Math.min(left[i], right[i]);
			waterBlocks += min - buildings[i];
		}
		return waterBlocks;
	}

}
