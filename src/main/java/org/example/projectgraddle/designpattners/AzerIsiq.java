package org.example.projectgraddle.designpattners;

public class AzerIsiq implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Azerisiq hesabina"+amount+ " Azn- borcunuz odendi :");
    }
}
