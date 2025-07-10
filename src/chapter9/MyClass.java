package chapter9;
// MyClass.java

public class MyClass {
    private String name;
    public int value;

    public MyClass() {
        this.name = "Default";
        this.value = 0;
    }

    public MyClass(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public void printInfo() {
        System.out.println("Name: " + name + ", Value: " + value);
    }

    private String getPrivateName() {
        return this.name;
    }

    public static void staticMethod() {
        System.out.println("This is a static method.");
    }
}
