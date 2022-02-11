package com.streamOperations;

import java.util.*;

public class MergeIntervals {

  public static void main(String[] args) {
    //
    List<List<Integer>> intervals = new ArrayList<>();
    intervals.add(Arrays.asList(1, 3));
    intervals.add(Arrays.asList(15, 18));
    intervals.add(Arrays.asList(2, 6));
    intervals.add(Arrays.asList(8, 10));
    Collections.sort(intervals, Comparator.comparing(o -> o.get(1)));
    System.out.println(intervals);
    merge(intervals);
  }

  public static List<List<Integer>> merge(List<List<Integer>> intervals) {
    LinkedList<List<Integer>> merged = new LinkedList<>();
    for (List<Integer> interval : intervals) {
      // if the list of merged intervals is empty or if the current
      // interval does not overlap with the previous, simply append it.
      if (merged.isEmpty() || merged.getLast().get(1) < interval.get(0)) {
        merged.add(interval);
      }
      // otherwise, there is overlap, so we merge the current and previous
      // intervals.
      else {
        merged.getLast().set(1, Math.max(merged.getLast().get(1), interval.get(1)));
      }
    }
    System.out.println(merged);
    return merged;
  }
}
