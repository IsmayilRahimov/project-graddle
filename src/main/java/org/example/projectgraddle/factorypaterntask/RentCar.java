package org.example.projectgraddle.factorypaterntask;

public class RentCar implements PayToWin{
    @Override
    public void rent(int amount) {
        System.out.println("Masin  "+amount+ "  azn borcunuz odendi :");
    }
}
