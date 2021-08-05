package com.hackerRank;

public class PermutationsInteger {
  public static void main(String[] args) {
    permutes(new int[3], 1, 3);
  }

  public static void permutes(int[] boxes, int ci, int ti) {
    if (ci > ti) {
      for (int i = 0; i < boxes.length; i++) {
        System.out.print(boxes[i]);
      }
      System.out.println();
      return;
    }
    for (int i = 0; i < boxes.length; i++) {
      if (boxes[i] == 0) {
        boxes[i] = ci;
        permutes(boxes, ci + 1, ti);
        boxes[i] = 0;
      }
    }
  }
}
