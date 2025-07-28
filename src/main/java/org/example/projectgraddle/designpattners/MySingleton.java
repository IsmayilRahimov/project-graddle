package org.example.projectgraddle.designpattners;

public class MySingleton {
    private static MySingleton instance;

    private MySingleton() {
    }

    public static MySingleton getInstance() {
        if (instance == null) { // daha evvel obyektin yaranib yaranmamasini  yoxlayir;
            instance = new MySingleton(); // eger yuxaridaki setr true olarsa obyekt yaranmayibsa yeni obyekti yaradir
        }
        return instance; // MySingleton obyektini bize qaytaracaq
    }

    public void showMessage() {
        System.out.println("This is my singleton");
    }
}
