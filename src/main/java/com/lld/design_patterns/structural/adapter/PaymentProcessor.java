package com.lld.design_patterns.structural.adapter;

public interface PaymentProcessor {
    void processPayment(String account, double amount);
}
