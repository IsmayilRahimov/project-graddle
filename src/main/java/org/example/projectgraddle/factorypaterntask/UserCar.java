package org.example.projectgraddle.factorypaterntask;

public class UserCar {
    public static PayToWin getPayToWin(String type){
        if(type.equalsIgnoreCase("Car")){
            return new RentCar();
        }else if(type.equalsIgnoreCase("Ship")){
            return new RentCarUseCar();
        }
        return null;
    }
}
