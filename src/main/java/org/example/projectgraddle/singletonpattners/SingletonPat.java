package org.example.projectgraddle.singletonpattners;

public class SingletonPat {
    private static SingletonPat instance;
    private SingletonPat(){}
    public static SingletonPat getInstance(){
        if(instance == null){
            instance = new SingletonPat();
        }
        return instance;
    }
    public void Odenis(int amount){
        System.out.println("Odenis "+amount+" azn mebleginde yerine yetirildi :");
    }
}
