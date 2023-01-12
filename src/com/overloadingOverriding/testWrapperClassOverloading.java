package com.overloadingOverriding;

public class testWrapperClassOverloading {
    public static void main(String[] args) {
        iWrapper(10);
        // output from: int 10
        iWrapper(new Integer(10));
        //output from : Integer: 10
    }

    public static void iWrapper(int i) {
        System.out.println("from: int " + i);
    }

    public static void iWrapper(Integer i) {
        System.out.println("from : Integer: " + i);
    }
}
