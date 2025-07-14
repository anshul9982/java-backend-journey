package chapter11;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class MapUsageAndCustomKey {

    public static void main(String[] args) {
        
        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("India", "New Delhi");
        hashmap.put("USA", "Washington DC");
        hashmap.put("Japan", "Tokyo");
        hashmap.put("China", "Beijing");
        hashmap.put("United Kingdom", "London");

        System.out.println(hashmap.get("India"));
        hashmap.put("China", "Shanghai");
        System.out.println(hashmap.get("China"));

        for (HashMap.Entry<String, String> entry : hashmap.entrySet()) {
            System.out.println(entry);
        }

        System.out.println(hashmap.containsKey("USA"));
        System.out.println(hashmap.containsValue("Tokyo"));

        System.out.println("----------///////////-------------");
        System.out.println();

        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("step1", "Initialize");
        linkedHashMap.put("step2", "Validate Input");
        linkedHashMap.put("step3", "Process Data");
        linkedHashMap.put("step4", "Save Results");

        System.out.println(linkedHashMap);




    }

}
