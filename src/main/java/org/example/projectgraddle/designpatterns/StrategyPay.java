package org.example.projectgraddle.designpatterns;

public class StrategyPay implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Kredit odenishiniz " + amount + " azn deyerinde odenildi:");
    }
}
