package org.example.projectgraddle.designpattners;

public class MySingle {
    private static MySingle instance;

    private MySingle() {
    }

    public static MySingle getInstance() {
        if (instance == null) {
            instance = new MySingle();
        }
        return instance;
    }

    public void showBook() {
        System.out.println("This is my single");
    }
}
