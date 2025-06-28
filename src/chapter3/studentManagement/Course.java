package chapter3.studentManagement;

public class Course implements Enrollable {
    private String courseName;
    private String courseCode;
    private int credits;

    public String getCourseName(){
        return this.courseName;
    }

    public String getCourseCode(){
        return this.courseCode;
    }

    public int getCredits(){
        return this.credits;
    }
    @Override
    public void enrollInCourse(String s){

    }
    @Override
    public void dropCourse(String s){

    }

    @Override
    public int getMaxCourseAllowed(){
        return 1;
    }


    public Course( String courseName, String courseCode, int credits){
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.credits = credits;
    }

    public void displayCourseInfo(){
        System.out.println("Your course name is : " +this.courseName + " and course code is : "+this.courseCode+" and credits are: "+this.credits);
    }

}
