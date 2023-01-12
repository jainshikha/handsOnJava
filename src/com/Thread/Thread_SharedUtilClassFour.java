package com.Thread;

public class Thread_SharedUtilClassFour {

    public synchronized void SharedMethod() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

    }
}