package org.example.projectgraddle.designpatterns;

public class AzerIsiq implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Azerisiq hesabina "+amount+ " Azn- borcunuz odendi :");
    }
}
