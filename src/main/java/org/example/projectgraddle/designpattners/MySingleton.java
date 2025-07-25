package org.example.projectgraddle.designpattners;

public class MySingleton {
    private static MySingleton instance;

    private MySingleton() {
    }

    public static MySingleton getInstance() {
        if (instance == null) {
            instance = new MySingleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("This is my singleton");
    }
}
