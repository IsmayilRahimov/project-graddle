package org.example.projectgraddle.designpattners;

import org.example.projectgraddle.singletonpattners.AnarPattners;

public class MySingletonUsage {
    public static void main(String[] args) {
        MySingleton mySingleton = MySingleton.getInstance();
        mySingleton.showMessage();
        MySingle mySingle = MySingle.getInstance();
        mySingle.showBook();
        AnarPattners objectanar = AnarPattners.getInstance();
        objectanar.showMessage();

    }
}
