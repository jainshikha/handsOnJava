package com.Thread;

/* This is an example of Thread Interference. Thread interference occurs when sequence of steps of
more than one threads overlap. */
public class Thread_ThreadSaftyComplex {
    public static void main(String[] args) {
        final Thread_SharedUtilClassThree sharedObject = new Thread_SharedUtilClassThree();
        Thread t1 = new Thread() {
            @Override
            public void run() {
                sharedObject.SharedMethod();
            }
        };
        Thread t2 = new Thread() {
            @Override
            public void run() {
                sharedObject.SharedMethod();
            }
        };
        t1.start();
        t2.start();

    }
}