package com.lld.design_patterns.creational.singleton;

public class Singleton {
    private static Singleton instance;

    private Singleton() {}

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("It guarantees that a class has just one instance and offers a way to access it globally");
    }
}
