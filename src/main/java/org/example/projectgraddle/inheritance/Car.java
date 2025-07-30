package org.example.projectgraddle.inheritance;

public class Car extends MachineSupport {
    public void drive() {
        System.out.println("Butun aftomobiller  hereket edir ve idare olunur:");
    }

    @Override
    public void produce() {
        System.out.println("Butun avtomobiller zavodlarda istehsal olunur:");
    }


}
