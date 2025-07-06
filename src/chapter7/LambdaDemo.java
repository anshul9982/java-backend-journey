package chapter7;

import java.util.ArrayList;
import java.util.List;

public class LambdaDemo {
    public static void main(String[] args) {
        
    
        List<MyFI> operations = new ArrayList<>();
        operations.add((a,b)->a+b);
        operations.add((a,b)->a-b);
        operations.add((a,b)->a*b);
        operations.add((a,b)->a/b);
        int value1 = 100;
        int value2 = 50;

        for (MyFI operate : operations) {
            System.out.println(operate.operate(value1, value2));
        }

    }
}
