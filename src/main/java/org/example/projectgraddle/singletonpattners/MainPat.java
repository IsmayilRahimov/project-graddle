package org.example.projectgraddle.singletonpattners;

public class MainPat {
    public static void main(String[] args) {
        SingletonPat pat = SingletonPat.getInstance();
        pat.Odenis(100);
        pat.Odenis(200);
    }
}
