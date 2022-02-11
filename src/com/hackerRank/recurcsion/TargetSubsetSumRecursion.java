package com.hackerRank.recurcsion;

public class TargetSubsetSumRecursion {
  public static void main(String[] args) {
    int[] arr = {10, 20, 30, 40, 50, 60};
    getSubsetSum(arr, 0, "", 0, 70);
  }

  public static void getSubsetSum(int[] arr, int idx, String set, int sos, int target) {
    if (idx == arr.length) {
      if (sos == target) {
        System.out.println(set);
      }
      return;
    }
    getSubsetSum(arr, idx + 1, set + arr[idx] + ",", sos + arr[idx], target);
    getSubsetSum(arr, idx + 1, set, sos, target);
  }
}
