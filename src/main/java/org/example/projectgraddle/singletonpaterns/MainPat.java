package org.example.projectgraddle.singletonpaterns;

import org.example.projectgraddle.designpatterns.MySingleton;

public class MainPat {
    public static void main(String[] args) {
        SingletonPat pat = SingletonPat.getInstance();
        pat.Odenis(100);
        pat.Odenis(200);
        MySingleton mySingleton2 = MySingleton.getInstance();
        mySingleton2.showMessage();

    }
}
