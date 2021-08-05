package com.hackerRank.recurcsion;

public class printDecreasingOrder {
  public static void main(String[] args) {
    printDecreasing(5);
  }

  public static void printDecreasing(int args) {
    if (args == 0) return;
    System.out.println(args);
    printDecreasing(args - 1);

    System.out.println(args);
  }
}
