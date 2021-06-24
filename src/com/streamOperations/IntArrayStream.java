package com.streamOperations;

import java.util.stream.IntStream;

public class IntArrayStream {
    public static void main(String[] args) {
        filerThenSquare();
    }

    static void filerThenSquare() {
        int x = (int) IntStream.range(0, 10)
                .filter(p -> p % 2 == 0)
                .mapToLong(p -> p * p).sum();
        System.out.println(x);

        IntStream.range(0, 10)
                .filter(p -> p % 2 == 0)
                .mapToLong(p -> (long) Math.pow(p, 2)).forEach(System.out::println);
    }
}
