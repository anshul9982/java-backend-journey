package chapter3.studentManagement;

import java.util.ArrayList;

public class StudentApp {
    public static void main(String[] args) {
        Student student1 = new Student("Anshul", "Computer Science", 8.5, 12 );
        Student student2 = new Student("Vishal", "Agriculture", 7.6, 10);
        Student student3 = new Student();
        Student student4 = new Student("Auysh", "BioTech", 8.5, 12);

        Course javaCourse = new Course("Intro to Java", "101", 3);


        student1.study();
        student1.studentInfo();
        student1.updateMajor("Mathematics");
        student1.studentInfo();
        if(student1.isEligibleForScholarship()){
            System.out.println(student1.getName() + " is eligible for a scholarship");
        }
        else System.out.println(student1.getName()+" is not eligible for a scholarship");

        student1.setGpa(9.0);
        student1.studentInfo();
        student1.setStatus(StudentStatus.ACTIVE);

        System.out.println(student1.getStatus());

        student2.study();
        student2.studentInfo();
        student2.updateMajor("Physics", 8);
        if(student2.isEligibleForScholarship()){
            System.out.println(student2.getName() + " is eligible for a scholarship ");
        }
        else System.out.println(student2.getName()+" is not eligible for a scholarship");
        student4.studentInfo();
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

        Student[] students = {student1, student2, student3};

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
        //student3.studentInfo();
    }
}
