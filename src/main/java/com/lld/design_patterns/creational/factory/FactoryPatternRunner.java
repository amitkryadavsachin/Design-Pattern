package com.lld.design_patterns.creational.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FactoryPatternRunner {

    @Autowired
    private ShapeFactory shapeFactory;

    public void run() {
        System.out.println("=== Factory Pattern Demo ===");

        Shape circle = shapeFactory.getShape("circle");
        circle.draw();

        Shape rectangle = shapeFactory.getShape("rectangle");
        rectangle.draw();

        Shape square = shapeFactory.getShape("square");
        square.draw();
    }
}
