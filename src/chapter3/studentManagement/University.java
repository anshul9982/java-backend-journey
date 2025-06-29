package chapter3.studentManagement;

import java.util.ArrayList;

public class University {
    public static final String UNIVERSITY_NAME = "Vikram University";

    static ArrayList<Student> students = new ArrayList<>(); 

    public static void welcome(){
        System.out.println("welcome to " + UNIVERSITY_NAME);
    }



    public static void addStudent(Student student){
        students.add(student);
    }



    public static double averageGpa(){
        if (students == null || students.isEmpty()) {
            System.out.println("No students to calculate gpa");
            return 0.0;
        }

        double total = 0.0;
        for (Student student : students) {
            total += student.getGpa();
        }

        return total / students.size();

    }
}
