package chapter3.studentManagement;

public class Student extends Person implements Enrollable {
    private final int studentId;
    private String major;
    private double gpa;
    private int creditsEnrolled;
    static int nextStudentId =1000;
    static int studentCount = 0;
    public static final int MAX_STUDENT_AGE = 100;
    private StudentStatus status;

    public Student(){
        status = StudentStatus.ACTIVE;
        gpa = 0.0;
        this.studentId = nextStudentId++;
        studentCount++;
        //System.out.println("new student object is created");
    }

    @Override
    public void enrollInCourse(String courseName){
        System.out.println(getName() + " has enrolled in " + courseName);
    }
    @Override
    public void dropCourse(String courseName){
        System.out.println(getName() + " has dropped the course in " + courseName);
    }

    @Override
    public int getMaxCourseAllowed(){
        return 5;
    }

    @Override
    public void showEnrollment(){
        System.out.println(getName()+ " is currently enrolled in "+ University.UNIVERSITY_NAME);
    }

    @Override
    public void performRole(){
        System.out.println("Student " + getName() + " is studying");
    }

    public int getStudentId(){
        return this.studentId;
    }
    public String getMajor(){
        return this.major;
    }

    public double getGpa(){
        return this.gpa;
    }

    public int getCreditsEnrolled(){
        return this.creditsEnrolled;
    }

    public void setMajor(String newMajor){
        this.major = newMajor;
    }

    public void setCreditsEnrolled(int creditsEnrolled){
        if (creditsEnrolled>0) {
            this.creditsEnrolled = creditsEnrolled;
        }
    }

    public void setGpa(double newGPA)throws InvalidStudentDataException{
        if(newGPA>0.0 && newGPA<=10.0){
            this.gpa = newGPA;
        }
        else{
        throw new InvalidStudentDataException("you given gpa : " + newGPA+ " is not valid");}
    }

    public Student(String name, String major, double gpa, int creditsEnrolled){
        super(name);
        status = StudentStatus.ACTIVE;
        this.studentId = nextStudentId++;
        this.major = major;
        this.gpa = gpa;
        this.creditsEnrolled =creditsEnrolled;
        studentCount++;
        //System.out.println("object is being created with parameterized constructor");
    }

    public StudentStatus getStatus(){
        return status;
    }



    public void setStatus(StudentStatus status) {
        this.status = status;
    }

    public static int getStudentCount(){
        return studentCount;
    }

    public boolean isEligibleForScholarship(){
        return gpa>3.5 && creditsEnrolled>=12;
    }

    public void updateMajor(String newMajor){
        major = newMajor;
        System.out.println("Major updated to :"+ newMajor);
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println( "Name : "+ getName()+ " gpa: " + getGpa() + " Major: "+ getMajor());
    }

    public void updateMajor(String newMajor, int newCreditsEnrolled){
        this.creditsEnrolled = newCreditsEnrolled;
        this.major = newMajor;
        System.out.println("updated major and credits enrolled are : " + major+ ", " + newCreditsEnrolled + " respectively");
    }

    public Student(String name, double gpa){
        this(name, "undeclared", gpa, 0);
    }
    @Override
    public String toString() {
        return super.toString().replace("]",
                ", studentId=" + studentId +
                        ", major=" + major +
                        ", gpa=" + gpa +
                        ", creditsEnrolled=" + creditsEnrolled +
                        ", status=" + status.getDescription() + "]"); // <--- Add this line
    }

    public void study(){
        System.out.println("Student "+getName()+" is studying "+this.major);
    }

    }


