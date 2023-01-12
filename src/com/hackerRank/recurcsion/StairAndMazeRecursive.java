package com.hackerRank.recurcsion;

import java.util.ArrayList;

public class StairAndMazeRecursive {

  public static void main(String[] args) {
    System.out.println(getStrairAndMaze(1, 1, 3, 3));
  }

  public static ArrayList<String> getStrairAndMaze(int sr, int sc, int dr, int dc) {
    if (sc == dc && sr == dr) {
      ArrayList<String> bres = new ArrayList<>();
      bres.add("");
      return bres;
    }
    ArrayList<String> path = new ArrayList<>();
    // hori
    for (int i = 1; i <= dc - sc; i++) {
      ArrayList<String> hpath = getStrairAndMaze(sr, sc + i, dr, dc);
      for (String hp : hpath) {
        path.add("h" + i + hp);
      }
    }
    for (int i = 1; i <= dr - sr; i++) {
      ArrayList<String> vpath = getStrairAndMaze(sr + i, sc, dr, dc);
      for (String vp : vpath) {
        path.add("v" + i + vp);
      }
    }
    for (int i = 1; i <= dc - sc && i <= dr - sr; i++) {
      ArrayList<String> dpath = getStrairAndMaze(sr + i, sc + i, dr, dc);
      for (String dp : dpath) {
        path.add("d" + i + dp);
      }
    }
    return path;
  }
}
