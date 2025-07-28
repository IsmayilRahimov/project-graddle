package org.example.projectgraddle.factorypaterntask;

public class RentCarUseCar implements PayToWin{
    @Override
    public void rent(int amount) {
        System.out.println("Gemi "+amount+ "  azn borcunuz odendi :");
    }
}
