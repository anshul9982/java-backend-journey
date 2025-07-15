package chapter12;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateOperationsExercise {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Alice", "Bob", "Anna", "Charles", "Andy", "arthur");
        List<String> str = list.stream()
            .filter(lis-> lis.toLowerCase().startsWith("a"))
            .map(String::toUpperCase)
            .collect(Collectors.toList());
        System.out.println(str);
        
        System.out.println();
        System.out.println("---------------///////////////------------------");
        System.out.println();
        
        List<List<String>> test = Arrays.asList(Arrays.asList("Math", "Physics"), Arrays.asList("Chemistry", "Math", "Biology"), Arrays.asList("Physics", "Art"));
        Set<String> set1 = test.stream()
                            .flatMap(s->s.stream())
                            .distinct()
                            .sorted()
                            .collect(Collectors.toCollection(TreeSet::new));

        System.out.println(set1);                    

        List<Integer> intList = Arrays.asList(8, 2, 9, 1, 5, 4, 7, 3, 6);
        List<Integer> stream = intList.stream()
                                        .sorted(Comparator.comparing(Integer::intValue).reversed())
                                        .skip(2)
                                        .limit(3)
                                        .collect(Collectors.toList());
        System.out.println(stream);
        
        System.out.println();
        System.out.println("---------------///////////////------------------");
        System.out.println();


        List<String> test1 = list.stream()
                                .filter(s->s.length()>3)
                                .peek(System.out::println)
                                .map(String::toLowerCase)
                                .peek(System.out::println)
                                .collect(Collectors.toList());
        System.out.println(test1);
                                        
                            


    }

}
