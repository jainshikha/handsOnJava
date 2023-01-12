package com.hackerRank;

public class ReverseWord {
  public static void main(String[] args) {
    reverseWords("hello world good morning");
    /* expected output:
    morning    good    world    hello
        * */
  }

  private static void reverseWords(String input) {
    String[] splitInput = input.split("\\s");
    System.out.println(splitInput.length);
    for (int i = splitInput.length - 1; i >= 0; i--) {
      System.out.println(splitInput[i]);
    }
  }
}
