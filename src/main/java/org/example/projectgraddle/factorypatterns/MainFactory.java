package org.example.projectgraddle.factorypatterns;

public class MainFactory {
    public static void main(String[] args) {
        PaymentAllFactory factory = new PaymentAllFactory();
        PayFactory payFactory = factory.getAmount("AzerSu");
        payFactory.pay(100);
        PayFactory payFactory1 = factory.getAmount("AzerIsiq");
        payFactory1.pay(145);
    }
}
