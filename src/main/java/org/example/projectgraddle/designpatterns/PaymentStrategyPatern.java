package org.example.projectgraddle.designpatterns;

public class PaymentStrategyPatern {
    public static PaymentStrategy getamount(String type) {
        if (type.equalsIgnoreCase("credit")) {
            return new StrategyPay();
        } else if (type.equalsIgnoreCase("azerisiq")) {
            return new AzerIsiq();
        }
        return null;


    }

    public static PaymentStrategy withdrawamount(int amount) {
        if (amount > 1000) {
            return new AzerIsiq();
        } else if (amount > 500) {
            return new StrategyPay();
        } else {
            return null;
        }

    }
}
