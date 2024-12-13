package com.lld.design_patterns.behavioral.singleton;

import org.springframework.stereotype.Component;

@Component
public class SingletonRunner {

    public void run() {
        System.out.println("=== Singleton Pattern Demo ===");
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        instance1.showMessage();
        System.out.println("Are both instances the same? " + (instance1 == instance2));
    }
}
