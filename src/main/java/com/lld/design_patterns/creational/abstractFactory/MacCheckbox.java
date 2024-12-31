package com.lld.design_patterns.creational.abstractFactory;

public class MacCheckbox implements Checkbox{

    @Override
    public void render() {
        System.out.println("Rendering Mac Checkbox");
    }
}
