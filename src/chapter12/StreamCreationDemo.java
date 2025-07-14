package chapter12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCreationDemo {
    public static void main(String[] args) {
        
        List<String> languages = Arrays.asList("Java", "C++", "C", "Python");
        Stream<String> langs = languages.stream();
        langs.forEach(System.out::println);

        String[] names = {"Anshul", "Akash", "Krishna", "Harsh"};
        Stream<String> name = Arrays.stream(names);
        name.forEach(System.out::println);

        Stream<Double> values = Stream.of(1.1, 2.3, 5.4, 3.4);
        values.forEach(System.out::println);

        Stream<Integer> multiplesOfThree = Stream.iterate(3, n->n+3);
        multiplesOfThree.limit(7).forEach(System.out::println);

        AtomicBoolean flag = new AtomicBoolean(true);

        List<Boolean> booleans = Stream.generate(() -> {
                boolean value = flag.get();
                flag.set(!value);
                return value;
            })
            .limit(10)
            .collect(Collectors.toList());

        booleans.forEach(System.out::println);

        
        


    }

}
