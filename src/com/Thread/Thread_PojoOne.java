package com.Thread;

public class Thread_PojoOne implements Runnable {
    String tname;

    Thread_PojoOne(String tname) {
        this.tname = tname;
    }

    @Override
    public void run() {
        System.out.println("Thread ID :" + tname);
        for (int i = 0; i <= 10; i++) {

            System.out.println(i);
        }
    }
}