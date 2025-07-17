package chapter12;
    import java.util.*;
import java.util.stream.*;
public class StreamFinalExercise {

public class TemperatureStats {
    public static void main(String[] args) {
        int[] temperatures = {25, 28, 22, 29, 26, 27, 24};

        // Sum of all temperatures
        int sum = IntStream.of(temperatures).sum();
        System.out.println("Sum: " + sum);

        // Average temperature
        OptionalDouble average = IntStream.of(temperatures).average();
        System.out.println("Average: " + (average.isPresent() ? average.getAsDouble() : "No average available"));

        // Maximum temperature
        OptionalInt max = IntStream.of(temperatures).max();
        System.out.println("Max: " + (max.isPresent() ? max.getAsInt() : "No max available"));

        // IntSummaryStatistics
        IntSummaryStatistics stats = IntStream.of(temperatures).summaryStatistics();
        System.out.println("Min: " + stats.getMin());
        System.out.println("Max: " + stats.getMax());
        System.out.println("Sum: " + stats.getSum());
        System.out.println("Average: " + stats.getAverage());
        System.out.println("Count: " + stats.getCount());

        // Filter temperatures >= 25 and box into List<Integer>
        List<Integer> filteredTemps = IntStream.of(temperatures)
                                               .filter(temp -> temp >= 25)
                                               .boxed()
                                               .collect(Collectors.toList());
        System.out.println("Filtered temperatures (>= 25): " + filteredTemps);
    }
}


}
