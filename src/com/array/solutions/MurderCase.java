package com.array.solutions;

import java.util.Arrays;
import java.util.Scanner;

/*
 * The two murderers are communicating via some strange arrangment of words.
 * As person has been involved at solving cases of such fashion, he is making some guesses on what
 * the message could be probably be. You have to check whether his guess is actually possible one or not.
 * 
 * Line 1: Message Received
 * Line 2: Prasun's guess
 * 
 * Input:
 * jogod #! siara.
 * raja is good!!
 * 
 * Output: YES
 */
public class MurderCase {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String line1 = s.nextLine();
		String line2 = s.nextLine();
		char[] array1 = line1.replaceAll(" ", "").replaceAll("[^a-zA-Z]", "").toLowerCase().toCharArray();
		char[] array2 = line2.replaceAll(" ", "").replaceAll("[^a-zA-Z]", "").toLowerCase().toCharArray();
		if (array1.length != array2.length) {
			System.out.println("NO");
		}
		Arrays.sort(array1);
		Arrays.sort(array2);
		for(int i=0; i<array1.length; i++) {
			if (array1[i] != array2[i]) {
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
	}

}
