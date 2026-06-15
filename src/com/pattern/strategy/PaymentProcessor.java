package com.pattern.strategy;
// Context class
public class PaymentProcessor {
    private PaymentStrategy strategy;

    public PaymentProcessor(
            PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void executePayment(int amount) {
        strategy.pay(amount);
    }
}
