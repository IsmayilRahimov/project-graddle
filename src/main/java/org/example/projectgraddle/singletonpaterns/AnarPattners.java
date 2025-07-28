package org.example.projectgraddle.singletonpaterns;

public class AnarPattners {
    private static AnarPattners instance;

    private AnarPattners() {
    }

    public static AnarPattners getInstance() {
        if (instance == null) {
            instance = new AnarPattners();
        }
        return instance;
    }
    public void showMessage(){
        System.out.println("This is anar pattern");
    }
}
