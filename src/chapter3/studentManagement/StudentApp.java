package chapter3.studentManagement;

public class StudentApp {
    public static void main(String[] args) {
        student student1 = new student();
        student student2 = new student();

        student1.name = "Anshul";
        student1.StudentId = 121;
        student1.Major = "Computer Science";
        student1.gpa = 8.5;

        student2.name = "Vishal";
        student2.StudentId = 120;
        student2.Major = "Agriculture";
        student2.gpa = 7.6;

        student1.study();
        student1.StudentInfo();

        student2.study();
        student2.StudentInfo();
    }
}
