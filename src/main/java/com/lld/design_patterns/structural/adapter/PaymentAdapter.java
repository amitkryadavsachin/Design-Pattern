package com.lld.design_patterns.structural.adapter;

public class PaymentAdapter implements PaymentProcessor {
    private final ThirdPartyPayment thirdPartyPayment;

    public PaymentAdapter(ThirdPartyPayment thirdPartyPayment) {
        this.thirdPartyPayment = thirdPartyPayment;
    }

    @Override
    public void processPayment(String account, double amount) {
        // Adapts the processPayment method to the pay method of ThirdPartyPayment
        thirdPartyPayment.pay(account, amount);
    }
}

