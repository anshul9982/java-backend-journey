package chapter12;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class TerminalOperations {

    public static void main(String[] args) {
        
        List<String> list = Arrays.asList("Java", "Python", "C++", "JavaScript", "C#", "Go", "Ruby");

        long lang = list.stream()
                        .filter(s->s.length()>4)
                        .count();

        System.out.println(lang);

        List<Integer> list2 = Arrays.asList(85, 92, 78, 95, 88, 60, 92);
        System.out.println(list2.stream().min(Comparator.comparing(Integer::intValue)).orElse(-1));
        list2.stream().max(Integer::compareTo).ifPresent(System.out::println);

        List<String> pro = Arrays.asList("Laptop", "Mouse", "Keyboard", "Monitor", "Webcam");
        Optional<String> withA =     pro.stream()
                                    .filter(s->s.startsWith("M"))
                                    .findFirst();
        System.out.println(withA.orElse("not found")); 
        
        
        boolean find = pro.stream().anyMatch(s->s.length()>7);
        System.out.println(find);

        boolean found = pro.stream().allMatch(s->s.startsWith("O"));
        System.out.println(found);

        boolean find2 = pro.stream().noneMatch(s->s.startsWith("X"));
        System.out.println(find2);

        List<Double> list3 = Arrays.asList(10.50, 20.00, 5.25, 15.75);
        System.out.println(list3.stream().reduce(0.0, Double::sum));
        System.out.println(list3.stream().map(String::valueOf).reduce("", (a,b) -> a + "," + b));




                                    



    }

}
