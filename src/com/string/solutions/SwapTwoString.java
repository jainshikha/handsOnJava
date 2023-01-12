package com.string.solutions;

/*
 * Write a program to swap two strings without using a third wariable.
 */
public class SwapTwoString {

    public static void main(String[] args) {
        String s1 = "Good", s2 = "Morning";
        System.out.println("Before swapping: " + s1 + " " + s2);

        s1 = s1 + s2;
        System.out.println(s1.length());
        System.out.println(s2.length());
        s2 = s1.substring(0, s1.length() - s2.length());

        s1 = s1.substring(s2.length());

        System.out.println("After swapping: " + s1 + " " + s2);
    }

}
