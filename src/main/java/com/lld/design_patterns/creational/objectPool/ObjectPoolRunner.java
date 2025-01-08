package com.lld.design_patterns.creational.objectPool;

import org.springframework.stereotype.Component;

@Component
public class ObjectPoolRunner {

    public void run(){
        ConnectionPool connectionPool = ConnectionPool.getInstance(3);

        System.out.println("Free connections: " + connectionPool.getFreeConnectionsCount());
        System.out.println("Used connections: " + connectionPool.getUsedConnectionsCount());

        // Borrow connections from the pool
        Connection connection1 = connectionPool.borrowConnection();
        Connection connection2 = connectionPool.borrowConnection();

        // Use the connections
        connection1.connect();
        connection2.connect();

        System.out.println("Free connections: " + connectionPool.getFreeConnectionsCount());
        System.out.println("Used connections: " + connectionPool.getUsedConnectionsCount());

        // Return connections to the pool
        connectionPool.returnConnection(connection1);
        connectionPool.returnConnection(connection2);

        System.out.println("Free connections after return: " + connectionPool.getFreeConnectionsCount());
        System.out.println("Used connections after return: " + connectionPool.getUsedConnectionsCount());
    }
}
