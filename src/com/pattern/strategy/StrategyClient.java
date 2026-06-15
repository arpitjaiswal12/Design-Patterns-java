package com.pattern.strategy;

public class StrategyClient {
    public static void main(String[] args) {

        PaymentProcessor p1 =
                new PaymentProcessor(
                        new UPIPayment());

        p1.executePayment(500);

        PaymentProcessor p2 =
                new PaymentProcessor(
                        new CreditCardPayment());

        p2.executePayment(1000);
    }
}
