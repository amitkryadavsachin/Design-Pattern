package com.lld.design_patterns.behavioral.factory;

import org.springframework.stereotype.Component;

@Component
public class FactoryPatternRunner {

    public void run() {
        System.out.println("=== Factory Pattern Demo ===");
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circle = shapeFactory.getShape("circle");
        circle.draw();

        Shape rectangle = shapeFactory.getShape("rectangle");
        rectangle.draw();

        Shape square = shapeFactory.getShape("square");
        square.draw();
    }
}
