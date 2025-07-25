package org.example.projectgraddle.runnabletask;

import org.example.projectgraddle.runnablethread.AzerSuRunnable;

public class MainPayment {
    public static void main(String[] args) {
        BankAccount bankhesabi = new BankAccount();
        Thread restoran = new Thread(() -> bankhesabi.pulOdeme(100, "Restoran"));
        Thread kafe = new Thread(() -> bankhesabi.pulOdeme(100, "Kafe"));
        kafe.start();
        restoran.start();
    }
}
