

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

``java
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

``java
Circle originalCircle = new Circle(10, "Red");
Circle clonedCircle = (Circle) originalCircle.clone();
clonedCircle.setColor("Blue");

System.out.println("Original Circle: " + originalCircle);
System.out.println("Cloned Circle: " + clonedCircle);


# Object Pool Design Pattern

## Overview

The **Object Pool Design Pattern** is a creational design pattern used to manage a set of reusable objects. Instead of creating and destroying objects frequently, the pattern allows clients to borrow objects from a pre-initialized pool and return them when done.

---

## Key Features
- **Singleton Connection Pool**: Ensures only one instance of the pool.
- **Separate Queues**: Maintains `freeConnections` and `usedConnections` for better management.
- **Thread Safety**: Synchronization ensures safe access in concurrent environments.

---

## Benefits
1. **Improved Performance**: Reduces the overhead of frequent object creation and destruction.
2. **Resource Optimization**: Ensures limited resources are efficiently reused.
3. **State Management**: Tracks the state of each object (free or used).

---

## Code Example: Singleton Connection Pool

### Connection Interface
Defines the contract for connection objects.

``java
public interface Connection {
    void connect();
    void disconnect();
}



#   



# Structural Design Patterns

Structural design patterns deal with how classes and objects are composed to form larger structures. These patterns focus on simplifying the design and ensuring better scalability, maintainability, and reusability.

## Common Structural Patterns
- Adapter Pattern  
- Bridge Pattern  
- Composite Pattern  
- Decorator Pattern  
- Facade Pattern  
- Flyweight Pattern  
- Proxy Pattern  


### What are Structural Design Patterns?
Structural design patterns focus on the composition of classes and objects to form larger structures. They help ensure that the resulting design is flexible and efficient. These patterns aim to simplify relationships between entities, whether through inheritance, composition, or delegation.

### Advantages of Using Structural Patterns
- Improved Scalability: Easy to expand and modify systems.  
- Enhanced Maintainability: Clear separation of concerns.  
- Code Reusability: Reduces redundancy and enhances reusability.  
- Better Performance: Optimizes resource usage, such as memory and processing.  

### Adapter Pattern
- Purpose: Converts the interface of one class into another that a client expects.  
- Use Case: Integrating legacy systems with new systems.  

### Bridge Pattern
- Purpose: Decouples an abstraction from its implementation so that both can vary independently.  
- Use Case: Separating device-specific code from generic business logic.  

### Composite Pattern
- Purpose: Composes objects into tree structures to represent part-whole hierarchies.  
- Use Case: Representing a file system or organizational hierarchy.  

### Decorator Pattern
- Purpose: Adds responsibilities to an object dynamically without modifying its code.  
- Use Case: Adding dynamic features to GUI components.  

### Facade Pattern
- Purpose: Provides a unified interface to a set of interfaces in a subsystem.  
- Use Case: Simplifying complex subsystems for easier usage.  

### Flyweight Pattern
- Purpose: Reduces memory usage by sharing as much data as possible with similar objects.  
- Use Case: Optimizing large numbers of fine-grained objects, like fonts or icons.  

### Proxy Pattern
- Purpose: Provides a surrogate or placeholder to control access to an object.  
- Use Case: Access control, caching, or lazy initialization.  

###  Implementation Examples
Each structural pattern has its implementation in a specific folder.  

- Adapter Pattern: com.lld.design_patterns.structural.composite.adapter  
- Bridge Pattern: com.lld.design_patterns.structural.composite.bridge  
- Composite Pattern: com.lld.design_patterns.structural.composite.composite  
- Decorator Pattern: com.lld.design_patterns.structural.composite.decorator  
- Facade Pattern: com.lld.design_patterns.structural.composite.facade  
- Flyweight Pattern: com.lld.design_patterns.structural.composite.flyweight  
- Proxy Pattern: com.lld.design_patterns.structural.composite.proxy  
###  Use Cases
- Adapter Pattern: Connecting incompatible APIs or classes.  
- Bridge Pattern: Separating UI rendering logic for desktop and mobile platforms.  
- Composite Pattern: Representing a graphical UI layout with nested elements.  
- Decorator Pattern: Dynamically adding scrollbars or borders to a UI widget.  
- Facade Pattern: Simplifying file system interactions for applications.  
- Flyweight Pattern: Rendering multiple instances of text in a document editor.  
- Proxy Pattern: Implementing security for a resource or caching results from a database.  



# Adapter Design Pattern
### Overview
The Adapter Pattern is a structural design pattern used to make incompatible interfaces work together. It acts as a bridge between two different interfaces by wrapping an existing class   with a new interface.  

### Components
- Target Interface: The interface expected by the client.  
- Adapter Class: Converts the adaptee interface into the target interface.  
- Adaptee Class: The existing interface that needs to be adapted.  
- Client: Uses the target interface.  

### Use Case
- Imagine an application using a legacy payment processor, but you want to integrate a third-party payment system. Instead of modifying the client code, you use an adapter to make the third-party payment system compatible with the existing codebase.

### Benefits of Adapter Pattern
- Enables integration of legacy or third-party systems.  
- Promotes reusability without modifying existing code.  
- Improves flexibility in system design.

### When to Use
- When you need to integrate incompatible systems.
- When you want to use an existing class but its interface does not match the required interface.


# Composite Design Pattern
## Overview
- The Composite Design Pattern is a structural design pattern that allows you to build complex tree structures by composing objects into hierarchical forms. It lets the client interact - with individual objects and groups of objects in the same way.

## Key Concepts
- Component: A common interface for all objects in the hierarchy.
-  Represents individual objects (e.g., files).
- Composite: Represents a group of objects (e.g., folders).
- Use Case
- Imagine a file system where:

## Files are individual components.
- Folders are composite components that can contain files or other folders.  
- The Composite Design Pattern allows you to interact with files and folders uniformly.  

## Benefits 
- Simplifies code dealing with tree structures.  
- Provides flexibility to add new components without changing existing code.  
- Enables part-whole hierarchies to be represented transparently.  
## When to Use
- When working with hierarchical structures (e.g., file systems, organizational charts).  
- When you want to treat individual objects and composites uniformly.  

