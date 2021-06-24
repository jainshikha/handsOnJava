package com.Thread;

public class Thread_PojoTwo implements Runnable {
    String tname;

    Thread_PojoTwo(String tname) {
        this.tname = tname;
    }

    @Override
    public void run() {
        System.out.println("Thread ID :" + tname);
        for (int i = 11; i <= 20; i++) {
            System.out.println(i);
        }
    }
}