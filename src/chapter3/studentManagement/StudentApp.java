package chapter3.studentManagement;

public class StudentApp {
    public static void main(String[] args) {
        Student student1 = new Student("Anshul", 121, "Computer Science", 8.5, 12 );
        Student student2 = new Student("Vishal", 120, "Agriculture", 7.6, 10);
        Student student3 = new Student();

        Course javaCourse = new Course("Intro to Java", "101", 3);


        student1.study();
        student1.studentInfo();
        student1.updateMajor("Mathematics");
        student1.studentInfo();
        if(student1.isEligibleForScholarship()){
            System.out.println(student1.name + " is eligible for a scholarship");
        }
        else System.out.println(student1.name+" is not eligible for a scholarship");


        student2.study();
        student2.studentInfo();
        student2.updateMajor("Physics", 8);
        if(student2.isEligibleForScholarship()){
            System.out.println(student2.name + " is eligible for a scholarship ");
        }
        else System.out.println(student2.name+" is not eligible for a scholarship");

        javaCourse.displayCourseInfo();

        //student3.study();
        //student3.studentInfo();
    }
}
