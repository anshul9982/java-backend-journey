package chapter11;

import java.util.LinkedList;
import java.util.Random;

public class LinkedListPerformanceDemo {

    private static final int NUM_ELEMENTS = 100_000;
    private static final int NUM_OPERATIONS = 10_000;

    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
        long stime1 = System.currentTimeMillis();
        for(int i = 0; i<NUM_ELEMENTS;i++){
            list1.add(i);
        }
        long etime1= System.currentTimeMillis();
        System.out.println("time for adding element : "+(etime1-stime1));

        LinkedList<Integer> list2 = new LinkedList<>();
        long stime2 = System.currentTimeMillis();
        for(int i = 0; i<NUM_OPERATIONS; i++){
            list2.add(0, i);
        }
        long etime2 = System.currentTimeMillis();
        System.out.println("time for adding element at index : " + (etime2-stime2));

        LinkedList<Integer> list3 = new LinkedList<>();
        Random random = new Random();
        for (int index = 0; index < NUM_ELEMENTS; index++) {
            list3.add(index);
        }
        long stime3 = System.currentTimeMillis();
        for (int index = 0; index < NUM_OPERATIONS; index++) {
            list3.get(random.nextInt(NUM_ELEMENTS));
        }
        long etime3 = System.currentTimeMillis();
        System.out.println("time for getting element : " + (etime3-stime3));

        long stime4 = System.currentTimeMillis();
        for (int index = 0; index < NUM_OPERATIONS; index++) {
            list3.remove(list3.size()/2);
            
        }
        long etime4 = System.currentTimeMillis();
        System.out.println("time for removing from middle: " + (etime4-stime4));



    }



}
