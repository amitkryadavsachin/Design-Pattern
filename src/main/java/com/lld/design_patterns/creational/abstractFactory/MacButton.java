package com.lld.design_patterns.creational.abstractFactory;

public class MacButton implements Button{

    @Override
    public void render() {
        System.out.println("Rendering Mac Button");
    }
}
