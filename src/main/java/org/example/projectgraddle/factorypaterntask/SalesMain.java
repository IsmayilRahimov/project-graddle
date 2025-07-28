package org.example.projectgraddle.factorypaterntask;

public class SalesMain {
    public static void main(String[] args) {
        UserCar masin = new UserCar();
        PayToWin payToWin = masin.getPayToWin("Car");
        payToWin.rent(100);
        PayToWin payToWin1 = masin.getPayToWin("Ship");
        payToWin1.rent(400);
    }
}
