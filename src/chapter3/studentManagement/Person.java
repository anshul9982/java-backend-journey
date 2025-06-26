package chapter3.studentManagement;

public class Person {
    private String name;

    public Person(){
        this.name = null;
    }

    public Person(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void displayInfo(){
        System.out.println("Name of the person is: "+ getName());
    }


}
