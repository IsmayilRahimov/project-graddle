package org.example.projectgraddle.projectarrays;

import java.util.*;

public class Project {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Student> studentsarray = new ArrayList<>();
        Set<Student> studentsset = new HashSet<>();
        Map<Integer, Student> studentsmap = new HashMap<>();
        System.out.println("Enter the number of students :");

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the name of student :");
            String name = scanner.next();
            System.out.println("Enter the grade of student :");
            int grade = scanner.nextInt();
            System.out.println("Enter the id of student :");
            int id = scanner.nextInt();
            scanner.nextLine();
            Student student = new Student(name, grade, id);
            studentsarray.add(student);
            if (!studentsmap.containsKey(student)) {
                studentsset.add(student);
            }

            studentsmap.put(id, student);
        }
        System.out.println(studentsset);
    }
}
