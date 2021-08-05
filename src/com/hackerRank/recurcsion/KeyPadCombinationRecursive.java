package com.hackerRank.recurcsion;

import java.util.ArrayList;

public class KeyPadCombinationRecursive {
  static String[] code = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

  public static void main(String[] args) {
    System.out.println(keyPadCombo("576"));
  }

  public static ArrayList keyPadCombo(String input) {
    if (input.length() == 0) {
      ArrayList emptyArray = new ArrayList();
      emptyArray.add("");
      return emptyArray;
    }
    char ch = input.charAt(0);
    String ros = input.substring(1);
    ArrayList<String> rres = keyPadCombo(ros);
    ArrayList<String> mres = new ArrayList<>();

    String codeForCh = code[ch - '0'];
    System.out.println(codeForCh);
    for (int i = 0; i < codeForCh.length(); i++) {
      char chCode = codeForCh.charAt(i);
      for (String rstr : rres) {
        mres.add(chCode + rstr);
      }
    }

    return mres;
  }
}
