package com.lld.design_patterns.structural.composite;

import org.springframework.stereotype.Component;

@Component
public class CompositeRunner {
    public void run() {
        System.out.println("=== Composite  Pattern Demo ===");
        File file1 = new File("File1.txt");
        File file2 = new File("File2.txt");
        File file3 = new File("File3.txt");

        Folder folder1 = new Folder("Folder1");
        Folder folder2 = new Folder("Folder2");

        folder1.addComponent(file1);
        folder1.addComponent(file2);
        folder2.addComponent(file3);

        Folder root = new Folder("Root");
        root.addComponent(folder1);
        root.addComponent(folder2);

        root.showDetails();
    }
}
