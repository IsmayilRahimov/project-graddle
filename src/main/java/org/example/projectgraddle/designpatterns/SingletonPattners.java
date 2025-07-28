package org.example.projectgraddle.designpatterns;

public class SingletonPattners {
    private static SingletonPattners instance;

    private SingletonPattners() {
    }

    public static SingletonPattners getInstance() {
        if (instance == null) {
            instance = new SingletonPattners();
        }
        return instance;
    }

    public void Odenis(int amount) {
        System.out.println("Odenis " + amount + " azn mebleginde yerine yetirildi :");
    }
}
