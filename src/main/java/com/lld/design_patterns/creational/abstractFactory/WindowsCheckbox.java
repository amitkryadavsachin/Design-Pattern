package com.lld.design_patterns.creational.abstractFactory;

public class WindowsCheckbox implements Checkbox{

    @Override
    public void render() {
        System.out.println("Rendering Windows Checkbox");
    }
}
