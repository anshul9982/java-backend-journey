package chapter3.studentManagement;

public class Course {
    String courseName;
    String courseCode;
    int credits;

    public Course( String courseName, String courseCode, int credits){
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.credits = credits;
    }

    public void displayCourseInfo(){
        System.out.println("Your couse name is : " +courseName + " and couse code is : "+courseCode+" and credits are: "+credits);
    }

}
