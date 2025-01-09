package com.lld.design_patterns.structural.adapter;

import org.springframework.stereotype.Component;

@Component
public class AdapterRunner {
    public void run() {
        System.out.println("Adapter Design Pattern Running");
        ThirdPartyPayment thirdPartyPayment = new ThirdPartyPayment();
        PaymentProcessor paymentProcessor = new PaymentAdapter(thirdPartyPayment);

        // Process payment through the adapter
        paymentProcessor.processPayment("user@example.com", 100.00);
    }
}
