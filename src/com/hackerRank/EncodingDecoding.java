package com.hackerRank;

import java.util.Arrays;

public class EncodingDecoding {
  public static void main(String[] args) {
    String input = "Hi how are you".replaceAll("\\s", "_");
    /*expected encoding
    H o r o _ _ _ i w e u _ _ _ _ _ _ _ _ _ _ h a y
    * */
    int len = 4;
    encoder(input, len);
  }

  public static String encoder(String input, int len) {
    int cols = (input.length() / len) + (len - 1);
    String[][] arr = new String[len][cols];
    for (int i = 0; i < len; i++) {
      for (int j = 0; j < cols; j++) {
        arr[i][j] = "_";
      }
    }

    int sVar = 0, col = 0, indx = 0;
    int max = input.length() - 1;
    for (int i = 0; i <= input.length() - 1; i = i + len) {
      for (int row = 0; row < len; row++, col++) {
        arr[row][col] = String.valueOf(input.charAt(indx));
        if (max > indx) indx++;
        else break;
      }
      sVar++;
      col = sVar;
    }
    String encode =
        Arrays.deepToString(arr).replaceAll("\\[", "").replaceAll("\\]", "").replaceAll(",", "");
    System.out.println(encode);
    return encode;
  }
}
