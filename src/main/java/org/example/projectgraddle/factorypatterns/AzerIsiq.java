package org.example.projectgraddle.factorypatterns;

public class AzerIsiq implements PayFactory {
    @Override
    public void pay(int amount) {
        System.out.println("Azerisiq hesabina " + amount + " Azn- borcunuz odendi :");
    }
}
