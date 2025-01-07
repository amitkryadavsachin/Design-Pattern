package com.lld.design_patterns.creational.prototype;

import org.springframework.stereotype.Component;

@Component
public class PrototypePatternRunner {

    public void run() {
        System.out.println("=== Prototype Pattern Demo ===");

        // Creating a Circle
        Circle originalCircle = new Circle(10, "Red");
        Circle clonedCircle = (Circle) originalCircle.clone();
        clonedCircle.setColor("Blue");

        System.out.println("Original Circle: " + originalCircle);
        System.out.println("Cloned Circle: " + clonedCircle);

        // Creating a Rectangle
        Rectangle originalRectangle = new Rectangle(20, 15, "Green");
        Rectangle clonedRectangle = (Rectangle) originalRectangle.clone();
        clonedRectangle.setHeight(25);

        System.out.println("Original Rectangle: " + originalRectangle);
        System.out.println("Cloned Rectangle: " + clonedRectangle);
    }
}
