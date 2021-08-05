package com.hackerRank;

public class AllSubset {
  public static void main(String[] args) {
    subSet("1234");
     /*expected encoding
    1 12 123 1234  2 23 234   3 34    4
    * */
  }

  private static void subSet(String input) {
    int size = input.length() - 1;
    for (int k = 0; k <= size; k++) {
      for (int i = 0; i <= size; i++) {
        for (int j = k; j <= i; j++) {
          System.out.print(input.charAt(j));
        }
        System.out.print(" ");
      }
    }
  }
}
