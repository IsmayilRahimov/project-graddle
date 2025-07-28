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
        SingletonPattners object = SingletonPattners.getInstance();
        object.Odenis(100);
        object.Odenis(200);
        StrategyPay object2 = new StrategyPay();
        object2.pay(100);
        AzerIsiq object3 = new AzerIsiq();
        object3.pay(100);

    }
}
