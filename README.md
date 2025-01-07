

[//]: # (The following was discovered as part of building this project:)

[//]: # ()
[//]: # (* The original package name 'com.lld.design-patterns' is invalid and this project uses 'com.lld.design_patterns' instead.)

[//]: # ()
[//]: # (# Getting Started)

[//]: # ()
[//]: # (### Reference Documentation)

[//]: # (For further reference, please consider the following sections:)

[//]: # ()
[//]: # (* [Official Gradle documentation]&#40;https://docs.gradle.org&#41;)

[//]: # (* [Spring Boot Gradle Plugin Reference Guide]&#40;https://docs.spring.io/spring-boot/3.4.0/gradle-plugin&#41;)

[//]: # (* [Create an OCI image]&#40;https://docs.spring.io/spring-boot/3.4.0/gradle-plugin/packaging-oci-image.html&#41;)

[//]: # (* [Spring Web]&#40;https://docs.spring.io/spring-boot/3.4.0/reference/web/servlet.html&#41;)

[//]: # ()
[//]: # (### Guides)

[//]: # (The following guides illustrate how to use some features concretely:)

[//]: # ()
[//]: # (* [Building a RESTful Web Service]&#40;https://spring.io/guides/gs/rest-service/&#41;)

[//]: # (* [Serving Web Content with Spring MVC]&#40;https://spring.io/guides/gs/serving-web-content/&#41;)

[//]: # (* [Building REST services with Spring]&#40;https://spring.io/guides/tutorials/rest/&#41;)

[//]: # ()
[//]: # (### Additional Links)

[//]: # (These additional references should also help you:)

[//]: # ()
[//]: # (* [Gradle Build Scans – insights for your project's build]&#40;https://scans.gradle.com#gradle&#41;)

[//]: # ()


## Java Design Patterns with Spring Boot
This project demonstrates various design patterns implemented in Java using the Spring Boot framework. Each design pattern is modularized into its own package for clarity and reusability. The project is structured to make learning, practicing, and integrating these patterns straightforward.

## **Project Structure**

- **src/main/java/com.lld.design_patterns/designpatterns**
- - `creational.` - Creational Pattern
      - `creational.singleton` - Singleton Pattern
      - `creational.factory` - Factory Pattern
      - `creational.abstractFactory` - Abstract Factory Pattern
  - `structural` - Structural Pattern
      - `structural.Adapter` - Adapter Pattern
  - `behavioral` - Behavioral Factory Pattern

  - *... other design patterns will follow the same structure.*
  
[//]: # (### Creational Patterns)

[//]: # (- **Singleton Pattern**: [Code]&#40;com.lld.design_patterns.creational.singleton&#41;)

[//]: # (- **Factory Pattern**: [Code]&#40;com.lld.design_patterns.creational.factory&#41;)

[//]: # ()
[//]: # (### Structural Patterns)

[//]: # (- **Adapter Pattern**: &#40;com.lld.design_patterns.structural.adapter&#41;)

[//]: # ()
[//]: # (### Behavioral Patterns)

[//]: # (- **Strategy Pattern**: Coming Soon...)

## **1. Singleton Pattern**

### **What is the Singleton Pattern?**

The Singleton Pattern ensures that a class has only **one instance** and provides a global access point to that instance.

### **Use Cases**
- Managing shared resources, such as configuration settings, thread pools, or logging.
- Ensuring consistency across the application by maintaining a single instance.

### **Code Overview**
The `Singleton` class ensures that only one instance of itself is created, even in multithreaded environments.

- **Key Methods**:
    - `getInstance()`: Ensures the single instance is created and returned.
    - `showMessage()`: A demo method for showing messages.

- **Example Execution**:
  The `SingletonRunner` demonstrates the Singleton pattern in action by verifying that two instances point to the same object.

## **2 Factory Pattern**
### **What is the Factory Pattern??**
The Factory Pattern is a creational design pattern that provides an interface for creating objects but allows subclasses to decide which class to instantiate. This pattern helps decouple the client code from the object creation logic.

### **Use Cases**
When the exact type of the object isn't known until runtime.
To reduce complexity and dependency in object creation.
For managing groups of related objects.
### **Code Overview**
Interface: Shape

Represents a common type for all shapes.
Concrete Classes: Circle, Rectangle, Square

Specific implementations of the Shape interface.
Factory Class: ShapeFactory

Provides a method to create objects based on input parameters.
Runner Class: FactoryPatternRunner
Demonstrates how the factory simplifies object creation and maintains flexibility.
### **Advantages**
Simplifies code by centralizing object creation.
Increases flexibility by decoupling object creation from implementation.



## **3. Abstract Factory Pattern**
### **What is the Abstract Factory Pattern?**
The Abstract Factory Pattern is a creational design pattern that provides an interface for creating families of related or dependent objects without specifying their concrete classes. It is often referred to as a "factory of factories."

### **Use Cases**
When multiple related objects need to be created consistently.
To support different families of related objects (e.g., UI components for different platforms).
When object creation involves complex interdependencies.
### **Code Overview**
Abstract Factory Interface: UIFactory

Defines methods to create related objects like Button and Checkbox.
Concrete Factories: WindowsUIFactory, MacUIFactory

Implementations for creating platform-specific UI components.
Abstract Products: Button, Checkbox

Common interfaces for products.
Concrete Products: WindowsButton, MacButton, WindowsCheckbox, MacCheckbox

Platform-specific implementations.
Runner Class: AbstractFactoryPatternRunner

Demonstrates how to use the abstract factory to create consistent, platform-specific UI components.
### **Advantages**
Promotes consistency among related objects.
Increases flexibility and scalability.
Makes the code easier to maintain and extend.

# Builder Design Pattern

## What is the Builder Design Pattern?

The **Builder Design Pattern** is a creational design pattern that provides a way to construct complex objects step-by-step. It allows you to create different types and configurations of the same object without cluttering the constructor with numerous parameters.

---

## Key Components

1. **Builder**: A separate class responsible for building the `Product`.
2. **Product**: The complex object being built (e.g., `Computer`).
3. **Director** (Optional): Orchestrates the building process.

---

## When to Use

- When an object has multiple optional or configurable fields.
- To avoid constructor overloading for various configurations of the object.

---

## Example

Imagine constructing a **Computer** object with various configurations, such as a gaming PC and an office PC. The **Builder Pattern** makes it easy to create these objects step-by-step.

---

## Code Example

### Creating a Gaming PC

```java
Computer gamingPC = new ComputerBuilder()
    .setCpu("Intel Core i9")
    .setRam("32GB")
    .setStorage("1TB SSD")
    .setGpu("NVIDIA RTX 3090")
    .setOs("Windows 11")
    .build();

System.out.println("Gaming PC: " + gamingPC);


# Prototype Design Pattern

## What is the Prototype Design Pattern?

The **Prototype Design Pattern** is a creational design pattern that allows you to create new objects by copying (cloning) existing ones. It avoids the need for creating new objects from scratch when it’s unnecessary or expensive.

---

## Key Concepts

1. **Prototype Interface**: Defines a `clone()` method for duplicating objects.
2. **Concrete Prototype**: Implements the `clone()` method to copy objects.
3. **Client**: Uses the `clone()` method to create objects.

---

## When to Use

1. To reduce the cost of creating new objects.
2. When creating new objects involves a complex initialization process.
3. To ensure all cloned objects are independent of the original.

---

## Code Example

### Cloning a Circle

```java
Circle originalCircle = new Circle(10, "Red");
Circle clonedCircle = (Circle) originalCircle.clone();
clonedCircle.setColor("Blue");

System.out.println("Original Circle: " + originalCircle);
System.out.println("Cloned Circle: " + clonedCircle);



