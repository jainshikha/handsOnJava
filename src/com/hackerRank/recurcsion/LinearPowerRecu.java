package com.hackerRank.recurcsion;

public class LinearPowerRecu {
  public static void main(String[] args) {
    System.out.println(power(3, 2));
  }

  public static int power(int x, int n) {
    if (n == 0) return 1;
    int xnm1 = power(x, n - 1);
    int xn = xnm1 * x;
    return xn;
  }
}
