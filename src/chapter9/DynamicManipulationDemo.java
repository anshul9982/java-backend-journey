package chapter9;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class DynamicManipulationDemo {
    public static void main(String[] args) {
        try {
            Class<MyClass> clazz = MyClass.class;
            Constructor<MyClass> noArgConstructor = clazz.getConstructor();
            MyClass obj1 = noArgConstructor.newInstance();
            obj1.printInfo();

            Field privateField = clazz.getDeclaredField("name");
            privateField.setAccessible(true);
            privateField.set(obj1, "Dynamically modified name");
            obj1.printInfo();

            Field publicField = clazz.getDeclaredField("value");
            publicField.set(obj1, 123);
            obj1.printInfo();

            Method publicMethod = clazz.getMethod("printInfo");
            publicMethod.invoke(obj1);

            Method staticMethod = clazz.getMethod("staticMethod");
            staticMethod.invoke(null);

            Method privaMethod = clazz.getMethod("getPrivateName");
            privaMethod.setAccessible(true);
            String privateName = (String)privaMethod.invoke(obj1);
            System.out.println(privateName);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

}
