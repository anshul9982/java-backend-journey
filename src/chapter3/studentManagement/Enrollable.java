package chapter3.studentManagement;

public interface Enrollable {
    void enrollInCourse(String courseName);
    void dropCourse(String courseName);
    int getMaxCourseAllowed();

    default void showEnrollment(){
        System.out.println("enrollment is being checked!");
    }
}
