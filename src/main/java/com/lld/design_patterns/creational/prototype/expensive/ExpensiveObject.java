package com.lld.design_patterns.creational.prototype.expensive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ExpensiveObject implements Cloneable {
    private String config;
    private List<String> data;

    public ExpensiveObject(String config) {
        System.out.println("Loading configuration...");
        this.config = config;

        // Simulate a costly process
        this.data = fetchDataFromDatabase();
    }

    private List<String> fetchDataFromDatabase() {
        try {
            Thread.sleep(2000); // Simulating delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return Arrays.asList("Data1", "Data2", "Data3");
    }

    public ExpensiveObject clone() {
        try {
            ExpensiveObject clone = (ExpensiveObject) super.clone();
            clone.data = new ArrayList<>(this.data); // Deep clone mutable fields
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public void setConfig(String config) {
        this.config = config;
    }

    @Override
    public String toString() {
        return "ExpensiveObject{config='" + config + "', data=" + data + '}';
    }
}
