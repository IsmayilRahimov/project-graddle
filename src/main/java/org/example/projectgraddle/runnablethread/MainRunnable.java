package org.example.projectgraddle.runnablethread;

public class MainRunnable {
    public static void main(String[] args) {
        Thread thread = new Thread(new AzerSuRunnable());
        Thread thread1 = new Thread(new AzerQazRunnable());
        Thread thread2 = new Thread(new AzerIsiqRunnable());
        Thread thread3 = new Thread(new ProjectRunnableExStudents());
        Thread thread4 = new Thread(new ProjetRunnable());
        thread.start();
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        System.out.println("Main clas runing :");
    }
}
