package chapter9;

public class ClassInfoDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        
        MyClass obj = new MyClass(); 
        Class<?> c1 = obj.getClass();
        Class<?> c2 = MyClass.class;
        Class<?> c3 = Class.forName("chapter9.MyClass");

        System.out.println(c1==c2);
        System.out.println(c2==c3);

        System.out.println(c1.getName());
        System.out.println(c1.getSimpleName());
        System.out.println(c1.isInterface());
        System.out.println(c1.isArray());
        System.out.println(c1.getSuperclass().getName());
        System.out.println(c1.getPackageName());

    }

}
