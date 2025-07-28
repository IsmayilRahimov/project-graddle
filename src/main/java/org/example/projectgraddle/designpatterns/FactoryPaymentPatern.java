package org.example.projectgraddle.designpatterns;

public class FactoryPaymentPatern {
    public static void main(String[] args) {
//        FactoryPayment factoryPayment = new FactoryPayment();
//        PaymentStrategy strategy = factoryPayment.getPaymentStrategy("credit");
//        strategy.pay(100);

        PaymentStrategyPatern odemek = new PaymentStrategyPatern();
        odemek.withdrawamount(2200);

        PaymentStrategy pay = odemek.getamount("crediT");
        pay.pay(20);
        pay = odemek.getamount("azerisiq");
        pay.pay(100);

    }
}
