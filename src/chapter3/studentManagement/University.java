package chapter3.studentManagement;

import java.util.ArrayList;
import java.util.HashMap;

public class University {
    public static final String UNIVERSITY_NAME = "Vikram University";

    static ArrayList<Student> students = new ArrayList<>(); 

    public static void welcome(){
        System.out.println("welcome to " + UNIVERSITY_NAME);
    }

    public static HashMap<Integer, Student> studentRegistery = new HashMap<>();

    public static void addStudent(Student student){
        students.add(student);
        if (studentRegistery.containsKey(student.getStudentId())) {
            System.out.println(student.getName()+ " with student id "+ student.getStudentId() + " is already registered");
        }
        else{
            studentRegistery.put(student.getStudentId(), student );
        }
    }

    public static Student getStudentById(int studentId){
        return studentRegistery.get(studentId);
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
