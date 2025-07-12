package chapter11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class ArrayPerformanceDemo {

    private static final int NUM_ELEMENTS = 100_000;
    private static final int NUM_OPERATIONS = 10_000;

    public static void main(String[] args) {
        
        ArrayList<Integer> list1 = new ArrayList<>();
        long startTime = System.nanoTime();
        for (int index = 0; index < NUM_ELEMENTS; index++) {
            list1.add(index);
        }
        long endTime = System.nanoTime();
        long durationInMilis = (endTime - startTime)/1000000;
        System.out.println(" adding operation took : " +durationInMilis+ " milis");

        ArrayList<Integer> list2 = new ArrayList<>();
        long startTime2 = System.currentTimeMillis();
        for (int index = 0; index < NUM_OPERATIONS; index++) {
            list2.add(0, index);            
        }
        long endTime2 = System.currentTimeMillis();
        long duration = endTime2 - startTime2;
        System.out.println("adding at index took : " + duration);


        ArrayList<Integer> getByIndex = new ArrayList<>();
        Random random = new Random();
        for (int index = 0; index < NUM_ELEMENTS; index++) {
            getByIndex.add(index);
        }

        long startTime3 = System.currentTimeMillis();
        for (int index = 0; index < NUM_OPERATIONS; index++) {
            getByIndex.get(random.nextInt(NUM_ELEMENTS));
        }
        long endTime3 = System.currentTimeMillis();
        long duration2 = endTime3-startTime3;
        System.out.println("getting random elements took : " + duration2);


        long startTime4 = System.currentTimeMillis();
        for (int index = 0; index < NUM_OPERATIONS; index++) {
            list1.remove(0);
        }
        long endTime4 = System.currentTimeMillis();
        long duration3 = endTime4 - startTime4;
        System.out.println("removing took : " + duration3);

        long stime5 = System.currentTimeMillis();
        for (int index = 0; index < NUM_OPERATIONS; index++) {
            getByIndex.remove(getByIndex.size()/2);
            
        }
        long etime5 = System.currentTimeMillis();
        System.out.println("time for removing from middle: " + (etime5-stime5));



    }

}
