package com.lld.design_patterns.creational.abstractFactory;

import org.springframework.stereotype.Component;

@Component
public class AbstractFactoryPatternRunner {

    public void run() {
        System.out.println("=== Abstract Factory Pattern Demo ===");

        // Use Windows factory
        UIFactory windowsFactory = new WindowsUIFactory();
        Button windowsButton = windowsFactory.createButton();
        Checkbox windowsCheckbox = windowsFactory.createCheckbox();

        windowsButton.render();
        windowsCheckbox.render();

        // Use Mac factory
        UIFactory macFactory = new MacUIFactory();
        Button macButton = macFactory.createButton();
        Checkbox macCheckbox = macFactory.createCheckbox();

        macButton.render();
        macCheckbox.render();
    }
}
