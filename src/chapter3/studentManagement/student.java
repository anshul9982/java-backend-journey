package chapter3.studentManagement;

public class student {
    String name;
    int StudentId;
    String Major;
    double gpa;

    public void study(){
        System.out.println("Student "+name+" is studying "+Major);
    }
    public void StudentInfo(){
        System.out.println("Name :"+name+", ID: "+StudentId+", Major: "+Major+", GPA: "+gpa );
    }
}

