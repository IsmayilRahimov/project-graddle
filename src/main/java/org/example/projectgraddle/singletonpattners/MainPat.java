package org.example.projectgraddle.singletonpattners;

import org.example.projectgraddle.designpattners.MySingleton;

public class MainPat {
    public static void main(String[] args) {
        SingletonPat pat = SingletonPat.getInstance();
        pat.Odenis(100);
        pat.Odenis(200);
        MySingleton mySingleton2 = MySingleton.getInstance();
        mySingleton2.showMessage();

    }
}
