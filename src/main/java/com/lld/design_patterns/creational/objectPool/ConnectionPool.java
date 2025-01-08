package com.lld.design_patterns.creational.objectPool;

import java.util.LinkedList;
import java.util.Queue;

public class ConnectionPool {
    private final Queue<Connection> freeConnections = new LinkedList<>();
    private final Queue<Connection> usedConnections = new LinkedList<>();
    private final int maxPoolSize;

    // Singleton instance
    private static ConnectionPool instance;

    // Private constructor
    private ConnectionPool(int maxPoolSize) {
        this.maxPoolSize = maxPoolSize;

        // Pre-initialize the pool with connections
        for (int i = 1; i <= maxPoolSize; i++) {
            freeConnections.add(new DatabaseConnection("Connection-" + i));
        }
    }

    // Get the singleton instance
    public static synchronized ConnectionPool getInstance(int maxPoolSize) {
        if (instance == null) {
            instance = new ConnectionPool(maxPoolSize);
        }
        return instance;
    }

    // Borrow a connection from the pool
    public synchronized Connection borrowConnection() {
        if (freeConnections.isEmpty()) {
            throw new RuntimeException("No available connections in the pool.");
        }
        Connection connection = freeConnections.poll();
        usedConnections.add(connection);
        System.out.println("Borrowed connection: " + connection);
        return connection;
    }

    // Return a connection to the pool
    public synchronized void returnConnection(Connection connection) {
        if (usedConnections.remove(connection)) {
            freeConnections.add(connection);
            System.out.println("Returned connection: " + connection);
        } else {
            System.out.println("Connection does not belong to the pool.");
        }
    }

    // Get the count of free connections
    public synchronized int getFreeConnectionsCount() {
        return freeConnections.size();
    }

    // Get the count of used connections
    public synchronized int getUsedConnectionsCount() {
        return usedConnections.size();
    }
}
