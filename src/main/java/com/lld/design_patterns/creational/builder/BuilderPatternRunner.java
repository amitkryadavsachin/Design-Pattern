package com.lld.design_patterns.creational.builder;

import org.springframework.stereotype.Component;

@Component
public class BuilderPatternRunner {

    public void run() {
        System.out.println("=== Builder Pattern Demo ===");

        // Creating a gaming PC
        Computer gamingPC = new ComputerBuilder()
                .setCpu("Intel Core i9")
                .setRam("32GB")
                .setStorage("1TB SSD")
                .setGpu("NVIDIA RTX 3090")
                .setOs("Windows 11")
                .build();

        System.out.println("Gaming PC: " + gamingPC);

        // Creating an office PC
        Computer officePC = new ComputerBuilder()
                .setCpu("Intel Core i5")
                .setRam("16GB")
                .setStorage("512GB SSD")
                .setOs("Windows 10")
                .build();

        System.out.println("Office PC: " + officePC);
    }
}
