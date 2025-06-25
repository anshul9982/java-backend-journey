package chapter3.studentManagement;

public class Student {
    private String name;
    private int studentId;
    private String major;
    private double gpa;
    private int creditsEnrolled;
    public Student(){
        gpa = 0.0;
        studentId = 0;
        System.out.println("new student object is created");
    }
    public String getName(){
        return this.name;
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

    public void setGpa(double newGPA){
        if(newGPA>0.0 && newGPA<=10.0){
            this.gpa = newGPA;
        }
        else System.out.println("GPA not valid!");
    }

    public Student(String name, int id, String major, double gpa, int creditsEnrolled){
        this.name = name;
        this.studentId = id;
        this.major = major;
        this.gpa = gpa;
        this.creditsEnrolled =creditsEnrolled;
        System.out.println("object is being created with paramaterised constructor");
    }

    public boolean isEligibleForScholarship(){
        return gpa>3.5 && creditsEnrolled>=12;
    }

    public void updateMajor(String newMajor){
        major = newMajor;
        System.out.println("Major updated to :"+ newMajor);
    }

    public void updateMajor(String newMajor, int newCreditsEnrolled){
        this.creditsEnrolled = newCreditsEnrolled;
        this.major = newMajor;
        System.out.println("updated major and credits enrolled are : " + major+ ", " + newCreditsEnrolled + " respectively");
    }

    public Student(String name, double gpa){
        this(name, 0, "undeclared", gpa, 0);
    }

    public void study(){
        System.out.println("Student "+this.name+" is studying "+this.major);
    }
    public void studentInfo(){
        System.out.println("Name :"+this.name+", ID: "+this.studentId+", Major: "+this.major+", GPA: "+this.gpa +" credits enrolled: "+this.creditsEnrolled );
    }
}

