package com.lld.design_patterns.creational.prototype.expensive;

import org.springframework.stereotype.Component;

@Component
public class PrototypeExpensiveRunner {
    public void run() {
        System.out.println("Creating prototype expensive object...");
        ExpensiveObject prototype = new ExpensiveObject("DefaultConfig");

        System.out.println("Cloning prototype...");
        ExpensiveObject clone1 = prototype.clone();
        clone1.setConfig("CustomConfig1");

        ExpensiveObject clone2 = prototype.clone();
        clone2.setConfig("CustomConfig2");

        System.out.println(prototype);
        System.out.println(clone1);
        System.out.println(clone2);

    }
}
