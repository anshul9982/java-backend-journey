package chapter3.studentManagement;

import java.io.IOException;
import java.util.ArrayList;

public class StudentApp {
    public static void main(String[] args) {
        Student student1 = new Student("Anshul", "Computer Science", 8.5, 12 );
        Student student2 = new Student("Vishal", "Agriculture", 7.6, 10);
        Student student3 = new Student();
        Student student4 = new Student("Auysh", "BioTech", 8.5, 12);

        Course javaCourse = new Course("Intro to Java", "101", 3);


        student1.study();

        student1.updateMajor("Mathematics");

        if(student1.isEligibleForScholarship()){
            System.out.println(student1.getName() + " is eligible for a scholarship");
        }
        else System.out.println(student1.getName()+" is not eligible for a scholarship");

        try {
            student1.setGpa(9.0);
            student1.setGpa(11.0);
        }catch (InvalidStudentDataException i){
            System.out.println(i.getMessage());
        }

        student1.setStatus(StudentStatus.ACTIVE);

        student2.study();

        student2.updateMajor("Physics", 8);
        if(student2.isEligibleForScholarship()){
            System.out.println(student2.getName() + " is eligible for a scholarship ");
        }
        else System.out.println(student2.getName()+" is not eligible for a scholarship");

        System.out.println(Student.getStudentCount());
        Student[] allStudents = {student1, student2, student3, student4};
        University.welcome();
        System.out.println("Average GPA of the university is : " + University.averageGpa(allStudents));

        javaCourse.displayCourseInfo();
        student2.displayInfo();
        System.out.println(student2.getStudentId());



        student2.performRole();
        student1.enrollInCourse("Data Structures");
        student1.dropCourse("Networking");
        System.out.println(student2.getName() + "can take up to " + student2.getMaxCourseAllowed()+ "courses");
        student2.showEnrollment();
        student2.setStatus(StudentStatus.GRADUATED);
        student3.setStatus(StudentStatus.SUSPENDED);
        double sum = 0;
        Student[] students = {student1, student2, student3};
        try {
            for (Student student : students){
                sum += student.getGpa();
            }

            System.out.println("average of gpa of top 3 is: " + sum/students.length);

        }catch (ArithmeticException e){
            System.out.println("this cant be divided by zero" + e.getMessage());
        }catch (ArrayIndexOutOfBoundsException a){
            System.out.println("Array cannot be empty" + a.getMessage());
        }
//        System.out.println("\n--- Simulating IOException with finally ---");
//        try {
//            System.out.println("Attempting to save student data to file...");
//
//            throw new IOException("Simulated network connection lost during save!");
//
//        } catch (IOException e) {
//            System.err.println("Caught a file/IO error: " + e.getMessage());
//        } finally {
//            System.out.println("Finally block: Ensuring file resources are closed.");
//        }
//        System.out.println("Program continues after simulated file operation.");

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

        for(Student student : students){
            switch (student.getStatus()){
                case ACTIVE :
                    System.out.println(student.getName()+ " is studying");
                    break;
                case INACTIVE:
                    System.out.println(student.getName() + " is yet to take admission");
                    break;
                case GRADUATED:
                    System.out.println(student.getName() + " has graduated successfully!");
                    break;
                case SUSPENDED:
                    System.out.println(student.getName()+ "is suspended unfortunately");
                    break;
                default:
                    System.out.println("bruh!");

            }
        }




        //student3.study();

    }
}
