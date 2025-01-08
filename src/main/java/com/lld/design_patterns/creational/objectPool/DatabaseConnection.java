package com.lld.design_patterns.creational.objectPool;

public class DatabaseConnection implements Connection {
    private final String connectionId;

    public DatabaseConnection(String connectionId) {
        this.connectionId = connectionId;
    }

    @Override
    public void connect() {
        System.out.println("Connecting using connection: " + connectionId);
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting connection: " + connectionId);
    }

    @Override
    public String toString() {
        return "DatabaseConnection{" + "connectionId='" + connectionId + '\'' + '}';
    }
}

