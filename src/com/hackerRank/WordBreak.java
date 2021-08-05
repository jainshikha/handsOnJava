package com.hackerRank;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class WordBreak {
  static HashSet<String> dictionary = new HashSet<String>();

  public static void main(String[] args) {
    dictionary.add("i");
    dictionary.add("like");
    dictionary.add("ice");
    dictionary.add("icecream");
    dictionary.add("cream");
    dictionary.add("mobile");
    dictionary.add("man");
    dictionary.add("mango");
    dictionary.add("go");
    findWord("ilikeicecream");
    findWord("ilikemango");

    int[] coin = {1, 2, 3};
    // System.out.println(coinCount(7, coin));
  }

  private static void findWord(String input) {
    int size = input.length();
    List<String> foundWords = new ArrayList<>();
    for (int incVar = 0; incVar < size - 1; incVar++) {
      for (int i = 0; i <= size - 1; i++) {
        StringBuilder str = new StringBuilder();
        for (int j = incVar; j <= i; j++) {
          str.append(input.charAt(j));
        }
        if (dictionary.contains(str.toString())) foundWords.add(str.toString());
      }
    }
    System.out.println(foundWords);
  }

  private static int coinCount(int amount, int[] coins) {
    if (coins == null) {
      return 0;
    }
    int[] F = new int[amount + 1];
    F[0] = 1; // This is the base case
    for (int coin : coins) {
      for (int value = 1; value <= amount; ++value) {
        System.out.println(value);
        /*if (coin <= value) {
          System.out.print( coin);
          F[value] += F[value - coin];
        }*/
      }
      System.out.println(" ..");
    }
    return F[amount];
  }
}
