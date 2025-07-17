package chapter12;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamCollectDemo {
    static class Student {
        String name;
        String major;
        int age;

        public Student(String name, String major, int age) {
            this.name = name;
            this.major = major;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public String getMajor() {
            return major;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return name + " (" + major + ", " + age + ")";
        }
    }

    public static void main(String[] args) {

        List<String> words = Arrays.asList("apple", "banana", "apricot", "grape", "orange", "avocado");
        System.out.println(words.stream()
                .filter(s -> s.startsWith("a"))
                .collect(Collectors.toList()));
        System.out.println(words.stream().distinct().collect(Collectors.toSet()));
        System.out.println(words.stream().filter(s -> s.length() > 5).collect(Collectors.joining(", ")));

        List<String> terms = Arrays.asList("P1:Laptop", "P2:Mouse", "P1:Tablet", "P3:Keyboard");
        Map<String, String> map = terms.stream().collect(Collectors.toMap(
                model -> model.split(":")[0],
                model -> model.split(":")[1],
                (existing, replacement) -> existing));
        System.out.println(map);

        List<Student> students = Arrays.asList(new Student("Alice", "CS", 20),

                new Student("Bob", "Math", 22),

                new Student("Charlie", "CS", 21),

                new Student("David", "Math", 20),

                new Student("Eve", "Art", 23),

                new Student("Frank", "CS", 17));
        
        Map<String, List<Student>> map2 = students.stream()
                                                  .collect(Collectors.groupingBy(Student::getMajor));    
        System.out.println(map2);                                        
        
        Map<String, Long> map3 = students.stream().collect(Collectors.groupingBy(Student::getMajor, Collectors.counting()));
        System.out.println(map3);

        Map<Boolean, List<Student>> map4 = students.stream().collect(Collectors.partitioningBy(s->s.getAge()>18));
        System.out.println(map4);

        int sumOfAge = students.stream().collect(Collectors.summingInt(Student::getAge));
        System.out.println(sumOfAge);
        double averageAge = students.stream().collect(Collectors.averagingDouble(Student::getAge));
        System.out.println(averageAge);
        Optional<Student> example = students.stream().collect(Collectors.minBy(Comparator.comparingInt(Student::getAge)));
        System.out.println(example.map(Student::getName));

    }
}
