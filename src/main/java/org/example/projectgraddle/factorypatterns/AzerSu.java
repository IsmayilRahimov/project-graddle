package org.example.projectgraddle.factorypatterns;

public class AzerSu implements PayFactory {
    @Override
    public void pay(int amount) {
        System.out.println("Azersu hesabina " + amount + " Azn- borcunuz odendi :");
    }
}
