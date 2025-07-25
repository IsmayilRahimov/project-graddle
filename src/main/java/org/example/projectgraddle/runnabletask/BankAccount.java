package org.example.projectgraddle.runnabletask;

public class BankAccount {
    private double balance = 1000;

    public synchronized void pulOdeme(double amount, String threadname) {
        if (amount <= balance) {  // eger odenilen mebleg balansdan kicikdirse


            System.out.println(threadname + " Emeliyyati ise dusdu -");  // emelliyyati ise sal:


            try {
                Thread.sleep(200);  // burda gozleme veririk ard arda emeliyati icra etmesin

            } catch (
                    InterruptedException e) { // false
                e.printStackTrace();
            }

            balance -= amount; // balans beraberdir balans - odenilen mebleg = yeni balans
            System.out.println(threadname + " Emeliyyati bitdi:Yeni balans: " + balance);
        }else {
            System.out.println(threadname + " Emeliyyati icin odenilen mebleg balansi yeterli deyil:");
        }
    }
}




