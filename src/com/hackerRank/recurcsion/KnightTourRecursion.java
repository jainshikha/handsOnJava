package com.hackerRank.recurcsion;

public class KnightTourRecursion {
  public static void main(String[] args) {
    getTour(new int[5][5], 2, 0, 1);
  }

  public static void getTour(int[][] chess, int r, int c, int move) {
    if (r < 0 || c < 0 || r >= chess.length || c >= chess.length || chess[r][c] > 0) {
      System.out.println("if");
      return;
    } else if (move == chess.length * chess.length) {
      System.out.println("else");
      chess[r][c] = move;
      displayBoard(chess);
      chess[r][c] = 0;
      return;
    }

    chess[r][c] = move;
    getTour(chess, r - 2, c + 1, move + 1);
    getTour(chess, r - 1, c + 2, move + 1);
    getTour(chess, r + 1, c + 2, move + 1);
    getTour(chess, r + 2, c + 1, move + 1);
    getTour(chess, r + 2, c - 1, move + 1);
    getTour(chess, r + 1, c - 2, move + 1);
    getTour(chess, r - 1, c - 2, move + 1);
    getTour(chess, r - 2, c - 1, move + 1);

    chess[r][c] = 0;
  }

  public static void displayBoard(int[][] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {

        System.out.print(arr[i][j]);
      }
      System.out.println();
    }
    System.out.println();
  }
}
