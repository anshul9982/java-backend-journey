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

        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("John Doe"));
        people.add(new Student("Jane Smith", "Computer Science", 9.0, 15));
        people.add(new Person("Alice Wonderland"));
        people.add(new Student("Bob Builder", "Engineering", 7.8, 10));

        for (Person person : people) {
            person.displayInfo();

            if (person instanceof Student) {
                Student student = (Student) person;
                System.out.println("Student ID: " + student.getStudentId());
                if (student.isEligibleForScholarship()) {
                    System.out.println("🎓 Eligible for scholarship!");
                }
            }
            System.out.println();
        }

        //student3.study();
        //student3.studentInfo();
    }
}
