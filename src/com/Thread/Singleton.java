package com.Thread;

import java.io.Serializable;

public class Singleton implements Serializable {
    private static volatile Singleton _instance; //volatile variable

    public static Singleton getInstance() {
        if (_instance == null) {
            synchronized (Singleton.class) {
                if (_instance == null) _instance = new Singleton();
            }
        }
        return _instance;
    }

}