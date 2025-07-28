package org.example.projectgraddle.designpattners;

public class FactoryPaymentPatern {
    public static void main(String[] args) {
        FactoryPayment factoryPayment = new FactoryPayment();
        PaymentStrategy strategy = factoryPayment.getPaymentStrategy("credit");
        strategy.pay(100);
    }
}
