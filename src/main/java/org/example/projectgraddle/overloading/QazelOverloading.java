package org.example.projectgraddle.overloading;

public class QazelOverloading {
    String transport(String qum) {
        return "Qazel " + qum + " dashiyir ";

    }

    String transport(String qum, String das) {
        return "Qazel " + qum + "" + das + " dashiyir ";
    }

    public static void main(String[] args) {
        QazelOverloading saqman = new QazelOverloading();
        String ilk = saqman.transport("qum ");
        String ikincis = saqman.transport("qum ", " das");
        System.out.println(ilk);
        System.out.println(ikincis);
    }
}
