package com.hackerRank.recurcsion;

public class FactorialRecursive {
  public static void main(String[] args) {
    System.out.println(printFactorial(3));
  }

  public static int printFactorial(int n) {
    if (n == 1) return 1;
    int factn1 = printFactorial(n - 1);
    int fact = n * factn1;
    return fact;
  }
}
