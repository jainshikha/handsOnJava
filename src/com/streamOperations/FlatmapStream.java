package com.streamOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatmapStream {
    /*
    The Structure before flattening is : [[5, 7, 11, 13], [1, 3, 5], [2, 4, 6, 8]]
    The Structure after flattening is : [5, 7, 11, 13, 1, 3, 5, 2, 4, 6, 8]
    */
    public static void main(String[] args) {
        // Creating a list of Prime Numbers
        List<Integer> PrimeNumbers = Arrays.asList(5, 7, 11, 13);

        // Creating a list of Odd Numbers
        List<Integer> OddNumbers = Arrays.asList(1, 3, 5);

        // Creating a list of Even Numbers
        List<Integer> EvenNumbers = Arrays.asList(2, 4, 6, 8);

        List<List<Integer>> listOfListofInts =
                Arrays.asList(PrimeNumbers, OddNumbers, EvenNumbers);

        System.out.println("The Structure before flattening is : " +
                listOfListofInts);

        // Using flatMap for transformating and flattening.
        List<Integer> listofInts = listOfListofInts.stream()
                .flatMap(list -> list.stream())
                .collect(Collectors.toList());

        System.out.println("The Structure after flattening is : " +
                listofInts);

        List<Integer> listOfNumbers = Arrays.asList(10, 20, 30, 40, 50, 60, 70);

        /*listOfNumbers.stream().anyMatch((x, y) -> {
            if ((x+y) % 50 == 0) {
                return true;
            }
        })*/
        listOfNumbers.stream().reduce((a, b) -> {
            //System.out.println(a + " before " + b);
            if ((a + b) % 50 == 0) {
                //   System.out.println(a + " " + b);
                return a + b; // will be "a" for next reduction
            }
            return 0;
        });

        System.out.println("-------------------");
        listOfNumbers.stream().reduce((a, b) -> {
            System.out.println(a + " " + b + " & sum is :" + (a + b));
            listOfNumbers.get(0);
            if ((a + b) % 50 == 0) {
                System.out.println(" sum is :" + (a + b));
                return a;
            } else return b;
        });

    }
}
