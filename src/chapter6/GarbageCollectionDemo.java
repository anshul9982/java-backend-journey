package chapter6;
import java.util.ArrayList;
import java.util.List;

public class GarbageCollectionDemo {
    public static void main(String[] args) {
        System.out.println("Creating short-lived object ");
        for (int index = 0; index < 10000000; index++) {
            new String("temp- " + index);
        }
        System.out.println("Finished creating short lived object");
        List<Object> longLivedList = new ArrayList<>();
        System.out.println("Creating long Lived Object");

        for(int i = 0; i<1000000; i++){
            longLivedList.add(new byte[1024]);
        }
        System.out.println("Finished creating long lived object");

        System.gc();
        System.out.println("garbage collector called");

        System.out.println("LONG LIVED OBJECT SIZE : " + longLivedList.size());
        System.out.println("Garbage Collector Demo Finished");
    }

    

}
