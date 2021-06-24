package com.Thread;

public class Thread_ThreadSynchronizationOneDemo {

    public static void main(String[] args) {
        final Thread_SharedUtilClassFour sharedObject = new
                Thread_SharedUtilClassFour();
        Thread t1 = new Thread("sampleFirstThread") {
            @Override
            public void run() {
                System.out.println(Thread.currentThread());
                sharedObject.SharedMethod();
            }
        };
        Thread t2 = new Thread("sampleSecondThread") {
            @Override
            public void run() {
                System.out.println(Thread.currentThread());
                sharedObject.SharedMethod();
            }
        };
        try {


            t1.run();
   //         t1.start();
     //       t2.start();
        }catch (Exception e){
            System.out.println("exceptions is :"+ e);
        }
    }
}