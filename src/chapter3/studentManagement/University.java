package chapter3.studentManagement;


public class University {
    public static final String UNIVERSITY_NAME = "Vikram University";

    public static void welcome(){
        System.out.println("welcome to " + UNIVERSITY_NAME);
    }

    public static double averageGpa(Student[] students){
        if (students == null || students.length == 0) {
            return 0.0;
        }

        double total = 0.0;
        for (Student student : students) {
            total += student.getGpa();
        }

        return total / students.length;

    }
}
