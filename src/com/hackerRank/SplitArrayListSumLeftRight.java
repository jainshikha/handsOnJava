package com.hackerRank;

import java.util.ArrayList;
import java.util.List;

public class SplitArrayListSumLeftRight {
  public static void main(String[] args) {
    List<Integer> x = new ArrayList<>();
    x.add(10);
    x.add(4);
    x.add(5);
    x.add(-8);
    x.add(7);
    spliting(x);
  }

  public static int spliting(List<Integer> arr) {
    int count = 0;
    for (int i = 0; i < arr.size() - 1; i++) {
      int l = 0, r = 0;
      for (int j = 0; j <= i; j++) {
        l += arr.get(j);
      }
      for (int j = i + 1; j < arr.size(); j++) {
        r += arr.get(j);
      }

      if (l > r) count++;
    }

    return count;
  }
}
