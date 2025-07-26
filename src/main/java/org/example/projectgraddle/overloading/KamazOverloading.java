package org.example.projectgraddle.overloading;

public class KamazOverloading {

    String transport(String qum) {
        return "Kamaz " + qum + " dashiyir ";


    }

    String transport(String qum, String das) {
        return "Kamaz " + qum + "" + das +  " dashiyir " ;
    }

    public static void main(String[] args) {
        KamazOverloading saqman = new KamazOverloading();
        String ilk = saqman.transport("qum");
        String ikincis = saqman.transport("qum ", "das");
        System.out.println(ilk);
        System.out.println(ikincis);
    }
}
