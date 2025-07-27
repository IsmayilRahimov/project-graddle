package org.example.projectgraddle.projectarrays;

public class Student {
    private String name;
    private int grade;
    private int id;

    public Student(String name, int grade, int id) {
        this.name = name;
        this.grade = grade;
        this.id = id;
    }

    public String toString() {
        return name + " " + grade + " " + id;
    }
}
