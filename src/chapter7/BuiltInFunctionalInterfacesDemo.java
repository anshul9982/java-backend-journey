package chapter7;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class BuiltInFunctionalInterfacesDemo {
public static void main(String[] args) {
    

    Consumer<String> test1 = (greeting) -> System.out.println(greeting);
    test1.accept("Hello! Anshul ");

    Predicate<Integer> isPositive = (n) -> n>0;
    System.out.println(isPositive.test(-10));

    Function<String, Integer> noOfVowels = (str) -> {
        int count = 0;
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
        String newstr = str.toLowerCase();
        for (int index = 0; index < newstr.length(); index++) {
            if (vowels.contains(newstr.charAt(index))) {
                count++;
            }
            
        }
        return count;
    };
    System.out.println(noOfVowels.apply("ANSHUL"));

    BiFunction<Double, Double, Double> calculateHypotenuse = (length, breadth) -> Math.sqrt(length*length+breadth*breadth);
    System.out.println(calculateHypotenuse.apply(5.0, 12.0));
}
}
