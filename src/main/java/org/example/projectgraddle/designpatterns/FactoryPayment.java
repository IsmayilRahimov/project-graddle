package org.example.projectgraddle.designpatterns;

public class FactoryPayment {
    public static PaymentStrategy getPaymentStrategy(String type){
        if(type.equalsIgnoreCase("credit")){
            return new StrategyPay();
        }else if(type.equalsIgnoreCase("azerisiq")){
            return new AzerIsiq();
        }
        return null;
    }
}
