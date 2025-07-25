package org.example.projectgraddle.multithreading;

public class MainProject {
    public static void main(String[] args) {
        ProjectThreading projectThreading = new ProjectThreading();
        projectThreading.start();
        ProjectStudents projectStudents = new ProjectStudents();
        projectStudents.run();
        AzerSu azerSu = new AzerSu();
        azerSu.start();
        AzerQaz azerQaz = new AzerQaz();
        azerQaz.start();
        AzerIsiq azerIsiq = new AzerIsiq();
        azerIsiq.start();

    }
}
