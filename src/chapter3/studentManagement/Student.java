package chapter3.studentManagement;

public class Student {
    String name;
    int studentId;
    String major;
    double gpa;
    public Student(){
        gpa = 0.0;
        studentId = 0;
        System.out.println("new student object is created");
    }

    public Student(String name, int id, String major, double gpa){
        this.name = name;
        this.studentId = id;
        this.major = major;
        this.gpa = gpa;
        System.out.println("object is being created with paramaterised constructor");
    }

    public Student(String name, double gpa){
        this(name, 0, "undeclared", 0.0);
    }

    public void study(){
        System.out.println("Student "+name+" is studying "+major);
    }
    public void studentInfo(){
        System.out.println("Name :"+name+", ID: "+studentId+", Major: "+major+", GPA: "+gpa );
    }
}

