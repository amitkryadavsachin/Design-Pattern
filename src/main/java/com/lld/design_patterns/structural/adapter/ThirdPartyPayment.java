package com.lld.design_patterns.structural.adapter;

public class ThirdPartyPayment {
    public void pay(String email, double amount) {
        System.out.println("Processing payment of $" + amount + " for " + email + " using ThirdPartyPayment.");
    }
}
