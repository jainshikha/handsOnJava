package com.hackerRank.recurcsion;

import java.util.ArrayList;

public class StairPathRecursive {
  public static void main(String[] args) {

    System.out.println(getStairPath(5));
  }

  public static ArrayList<String> getStairPath(int n) {
    if (n == 0) {
      ArrayList<String> brs = new ArrayList();
      brs.add("");
      return brs;
    } else if (n < 0) {
      ArrayList<String> brs = new ArrayList();
      return brs;
    }
    ArrayList<String> path1 = getStairPath(n - 1);
    ArrayList<String> path2 = getStairPath(n - 2);
    ArrayList<String> path3 = getStairPath(n - 5);
    ArrayList<String> path = new ArrayList<>();
    for (String p : path1) {
      path.add(1 + p);
    }
    for (String p : path2) {
      path.add(2 + p);
    }
    for (String p : path3) {
      path.add(5 + p);
    }
    return path;
  }
}
