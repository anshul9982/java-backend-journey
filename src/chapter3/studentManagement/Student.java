package chapter3.studentManagement;

public class Student {
    String name;
    int studentId;
    String major;
    double gpa;
    int creditsEnrolled;
    public Student(){
        gpa = 0.0;
        studentId = 0;
        System.out.println("new student object is created");
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
        creditsEnrolled = newCreditsEnrolled;
        major = newMajor;
        System.out.println("updated major and credits enrolled are : " + major+ ", " + newCreditsEnrolled + " respectively");
    }

    public Student(String name, double gpa){
        this(name, 0, "undeclared", gpa, 0);
    }

    public void study(){
        System.out.println("Student "+name+" is studying "+major);
    }
    public void studentInfo(){
        System.out.println("Name :"+name+", ID: "+studentId+", Major: "+major+", GPA: "+gpa +" credits enrolled: "+creditsEnrolled );
    }
}

