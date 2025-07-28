package org.example.projectgraddle.factorypatterns;

public class PaymentAllFactory {
    public static PayFactory getAmount(String type) {
        if (type.equalsIgnoreCase("AzerIsiq")) {
            return new AzerIsiq();
        } else if (type.equalsIgnoreCase("AzerSu")) {
            return new AzerSu();
        } else {
            return null;
        }
    }
}
