package com.Thread;

public class Thread_SharedUtilClassThree {
    int i = 0;

    public void SharedMethod() {
        i = 10;
        System.out.println(i);
        i = 20;
        System.out.println(i);
        i = 30;
        System.out.println(i);
    }

}