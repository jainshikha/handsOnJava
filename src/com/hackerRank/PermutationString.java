package com.hackerRank;

public class PermutationString {
  public static void main(String[] args) {
    permutes("abc", "");
  }

  public static void permutes(String input, String asf) {
    if (input.length() == 0) {
      System.out.println(asf);
      return;
    }
    for (int i = 0; i < input.length(); i++) {
      char ch = input.charAt(i);
      String left = input.substring(0, i);
      String right = input.substring(i + 1);
      String rof = left + right;
      permutes(rof, asf + ch);
    }
  }
}
