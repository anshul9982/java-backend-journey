package chapter3.studentManagement;

public class StudentApp {
    public static void main(String[] args) {
        Student student1 = new Student("Anshul", 121, "Computer Science", 8.5 );
        Student student2 = new Student("Vishal", 120, "Agriculture", 7.6);
        Student student3 = new Student();
        student1.study();
        student1.studentInfo();

        student2.study();
        student2.studentInfo();

        student3.study();
        student3.studentInfo();
    }
}
