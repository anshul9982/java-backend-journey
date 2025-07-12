package chapter11;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class SetPerformanceAndOrder {

    private static final int NUM_ELEMENTS = 1000000;

    public static void main(String[] args) {
        
        Set<Integer> set1 = new LinkedHashSet<>();
        set1.add(1);
        set1.add(3);
        set1.add(9);
        set1.add(4);
        set1.add(6);
        set1.add(5);
        set1.add(7);
        set1.add(2);

        System.out.println(set1);
        set1.clear();

        Set<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(3);
        set2.add(9);
        set2.add(4);
        set2.add(6);
        set2.add(5);
        set2.add(7);
        set2.add(2);

        System.out.println(set2);
        set2.clear();

        Set<Integer> set3 = new HashSet<>();
        Random random = new Random();
        long stime1 = System.currentTimeMillis();
        for(int i = 0; i < NUM_ELEMENTS; i++) {
            set3.add(random.nextInt(NUM_ELEMENTS));
        }
        long etime1 = System.currentTimeMillis();
        System.out.println("time for adding elements : " + (etime1-stime1));

        long stime2 = System.currentTimeMillis();
        for (int index = 0; index <NUM_ELEMENTS ; index++) {
            set3.contains(index);
        }
        long etime2 = System.currentTimeMillis();
        System.out.println("time taken by contains() : " + (etime2-stime2));
        set3.clear();

        long stime3 = System.currentTimeMillis();
        for (int index = 0; index < NUM_ELEMENTS; index++) {
            set1.add(random.nextInt(NUM_ELEMENTS));
        }
        long etime3 = System.currentTimeMillis();
        System.out.println("time taken to add in linked hash set : " + (etime3-stime3));

        long stime4 = System.currentTimeMillis();
        for (int index = 0; index < NUM_ELEMENTS; index++) {
            set1.contains(index);
        }
        long etime4 = System.currentTimeMillis();
        System.out.println("time for contains () in linked hashset : " + (etime4 - stime4));








    }

    

}
