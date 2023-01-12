package com.hackerRank.recurcsion;

import java.util.ArrayList;

public class MazePAthRecursive {
  public static void main(String[] args) {
    System.out.println(getMazePAth(1, 1, 2, 2));
  }

  public static ArrayList<String> getMazePAth(int sourceRow, int sc, int destinationRow, int dc) {
    if (sc == dc && sourceRow == destinationRow) {
      ArrayList<String> bcase = new ArrayList<>();
      bcase.add("");
      return bcase;
    }
    ArrayList<String> hPath = new ArrayList<>();
    ArrayList<String> vPath = new ArrayList<>();
    ArrayList<String> path = new ArrayList<>();
    if (sc < dc) {
      hPath = getMazePAth(sourceRow, sc + 1, destinationRow, dc);
    }
    if (sourceRow < destinationRow) {
      vPath = getMazePAth(sourceRow + 1, sc, destinationRow, dc);
    }
    for (String hp : hPath) {
      path.add("h" + hp);
    }
    for (String vp : vPath) {
      path.add("v" + vp);
    }
    return path;
  }
}
