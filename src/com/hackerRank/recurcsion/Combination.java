package com.hackerRank.recurcsion;

public class Combination {
  public static void main(String[] args) {
    int noOfBoxes = 8;
    int noOfItems = 2;
    getCombination(1, noOfBoxes, 0, noOfItems, "");
  }

  public static void getCombination(int cb, int tb, int ssf, int ts, String asf) {
    if (cb > tb) {
      if (ssf == ts) {
        System.out.println(asf);
      }
      return;
    }
    getCombination(cb + 1, tb, ssf + 1, ts, asf + "i");
    getCombination(cb + 1, tb, ssf, ts, asf + "-");
  }
}
