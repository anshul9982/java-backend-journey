package chapter3.studentManagement;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class StudentApp {
    public static void main(String[] args) {
        System.out.println("Current Working Directory: " + System.getProperty("user.dir"));
        Student student1 = new Student("Anshul", "Computer Science", 8.5, 12);
        Student student2 = new Student("Vishal", "Agriculture", 7.6, 10);
        Student student3 = new Student("Akash", "Computer Science", 8.0, 14);
        Student student4 = new Student("Auysh", "BioTech", 8.5, 12);

        Course javaCourse = new Course("Intro to Java", "101", 3);

        student1.study();

        student1.updateMajor("Mathematics");

        if (student1.isEligibleForScholarship()) {
            System.out.println(student1.getName() + " is eligible for a scholarship");
        } else
            System.out.println(student1.getName() + " is not eligible for a scholarship");

        try {
            student1.setGpa(9.0);
            student1.setGpa(11.0);
        } catch (InvalidStudentDataException i) {
            System.out.println(i.getMessage());
        }

        student1.setStatus(StudentStatus.ACTIVE);

        student2.study();

        student2.updateMajor("Physics", 8);
        if (student2.isEligibleForScholarship()) {
            System.out.println(student2.getName() + " is eligible for a scholarship ");
        } else
            System.out.println(student2.getName() + " is not eligible for a scholarship");

        System.out.println(Student.getStudentCount());

        
        University.addStudent(student1);
        University.addStudent(student2);
        University.addStudent(student3);
        University.addStudent(student4);


        //Student[] allStudents = { student1, student2, student3, student4 };
        University.welcome();
        System.out.println("Average GPA of the university is : " + University.averageGpa());

        javaCourse.displayCourseInfo();
        student2.displayInfo();
        System.out.println(student2.getStudentId());

        student2.performRole();
        student1.enrollInCourse("Data Structures");
        student1.enrollInCourse("Networking");
        student1.enrollInCourse("Networking");
        student1.dropCourse("Data Structures");
        System.out.println(student2.getName() + " can take up to " + student2.getMaxCourseAllowed() + " courses");
        student2.showEnrollment();
        student2.setStatus(StudentStatus.GRADUATED);
        student3.setStatus(StudentStatus.SUSPENDED);
        student3.displayInfo();
        double sum = 0;
        Student[] students = { student1, student2, student3 };
        try {
            for (Student student : students) {
                sum += student.getGpa();
            }

            System.out.println("average of gpa of top 3 is: " + sum / students.length);

        } catch (ArithmeticException e) {
            System.out.println("this cant be divided by zero" + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException a) {
            System.out.println("Array cannot be empty" + a.getMessage());
        }
        // System.out.println("\n--- Simulating IOException with finally ---");
        // try {
        // System.out.println("Attempting to save student data to file...");
        //
        // throw new IOException("Simulated network connection lost during save!");
        //
        // } catch (IOException e) {
        // System.err.println("Caught a file/IO error: " + e.getMessage());
        // } finally {
        // System.out.println("Finally block: Ensuring file resources are closed.");
        // }
        // System.out.println("Program continues after simulated file operation.");

        System.out.println("\n--- Demonstrating Polymorphism with ArrayList<Enrollable> ---");
        ArrayList<Enrollable> enrollables = new ArrayList<>();
        enrollables.add(student1); // Student implements Enrollable

        // For now, just using students:
        enrollables.add(student2);
        enrollables.add((javaCourse)); // Assuming Course implements Enrollable

        for (Enrollable item : enrollables) {
            item.enrollInCourse("Advanced Topics");
            item.showEnrollment();
        }

        for (Student student : students) {
            switch (student.getStatus()) {
                case ACTIVE:
                    System.out.println(student.getName() + " is studying");
                    break;
                case INACTIVE:
                    System.out.println(student.getName() + " is yet to take admission");
                    break;
                case GRADUATED:
                    System.out.println(student.getName() + " has graduated successfully!");
                    break;
                case SUSPENDED:
                    System.out.println(student.getName() + " is suspended unfortunately");
                    break;
                default:
                    System.out.println("bruh!");

            }
        }
        System.out.println("\n--- Demonstrating try-with-resources for file reading ---");
        String filePath = "D:\\DEVELOPMENT\\JAVA\\Day01-Java-Intro\\student_log.txt";

        try (BufferedReader fReader = new BufferedReader(new FileReader(filePath))) {
            String line;
            System.out.println("Reading Student file : ");
            while ((line = fReader.readLine()) != null) {
                System.out.println(" " + line);

            }

        } catch (IOException e) {
            System.out.println("error accessing file : " + e.getMessage());

        }
        System.out.println("Student log file operation completed (resources automatically closed).");
        
       System.out.println(University.getStudentById(1002).getName());

    }


    // student3.study();

}
