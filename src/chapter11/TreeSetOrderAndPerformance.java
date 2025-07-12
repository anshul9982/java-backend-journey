package chapter11;
import java.util.Random;
import java.util.TreeSet;

public class TreeSetOrderAndPerformance {
    private static final int NUM_ELEMENTS = 100_000;
    public static void main(String[] args) {
        long stime = System.currentTimeMillis();
        TreeSet<Integer> set1 = new TreeSet<>();
        for (int index = NUM_ELEMENTS-1; index >=0 ; index--) {
            set1.add(index);
        }
        long etime = System.currentTimeMillis();
        System.out.println("time to add element into treeset : " + (etime - stime));
        int count = 0;
        for (Integer num : set1) {
            if(count>=10)break;
            System.out.println(num);
            count++;
        }
        Random random = new Random();
        long stime1 = System.currentTimeMillis();
        for(int i = 0; i < NUM_ELEMENTS; i++){
            set1.contains(random.nextInt(NUM_ELEMENTS));
        }
        long etime1 = System.currentTimeMillis();
        System.out.println("time taken to perform contains() by treeset: " + (etime1-stime1)); 

        TreeSet<String> treeSet = new TreeSet<>((s1,s2)->{
            int lenDiff = s1.length() - s2.length();
            if(lenDiff == 0){
                return s1.compareTo(s2);
            }
            return lenDiff;
        });

        treeSet.add("anshul");
        treeSet.add("akash");
        treeSet.add("lavendra");
        treeSet.add("rahul");
        treeSet.add("shashank");
        treeSet.add("atharva");
        treeSet.add("harsh");

        System.out.println(treeSet);






        
    }

}
