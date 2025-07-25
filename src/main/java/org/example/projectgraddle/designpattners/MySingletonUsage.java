package org.example.projectgraddle.designpattners;

public class MySingletonUsage {
    public static void main(String[] args) {
        MySingleton mySingleton = MySingleton.getInstance();
        mySingleton.showMessage();
        MySingle mySingle = MySingle.getInstance();
        mySingle.showBook();

    }
}
