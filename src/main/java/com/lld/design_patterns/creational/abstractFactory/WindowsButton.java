package com.lld.design_patterns.creational.abstractFactory;

public class WindowsButton implements Button{

    @Override
    public void render() {
        System.out.println("Rendering Windows Button");
    }
}
