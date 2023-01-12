package com.Thread;

public class Thread_MultipleThreadExecutionWithoutOrder {
    public static void main(String[] args) {
        Thread tone = new Thread(new Thread_PojoOne("First Thread"));
        Thread ttwo = new Thread(new Thread_PojoTwo("Second Thread"));
        tone.start();
        ttwo.start();
        System.out.println("proprity is "+tone.getPriority());
    }
}
