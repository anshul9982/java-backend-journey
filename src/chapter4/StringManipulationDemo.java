package chapter4;

public class StringManipulationDemo {
    public static void main(String[] args) {
        System.out.println("--- Demonstrating String Immutability ---");
        String s1 = "Hello";
        System.out.println("Original s1: " + s1); // Output: Hello

        s1 = s1 + " World"; 
        System.out.println("Modified s1: " + s1); // Output: Hello World
        // Internally, a new String object "Hello World" was created,
        // and s1's reference was updated to point to this new object.
        // The original "Hello" object still exists.

        System.out.println("\n--- Demonstrating String Pool and '==' vs 'equals()' ---");
        String str1 = "Java"; // Literal
        String str2 = "Java"; // Literal - refers to the same object in the String Pool
        String str3 = new String("Java"); // New object created on the Heap
        String str4 = new String("Java"); // Another new object created on the Heap

        // '==' compares object references (memory addresses)
        System.out.println("str1 == str2: " + (str1 == str2)); // true (same object in pool)
        System.out.println("str1 == str3: " + (str1 == str3)); // false (str3 is a new object on heap)
        System.out.println("str3 == str4: " + (str3 == str4)); // false (str3 and str4 are different new objects)

        // 'equals()' compares the actual content of the strings
        System.out.println("str1.equals(str2): " + str1.equals(str2)); // true (content is same)
        System.out.println("str1.equals(str3): " + str1.equals(str3)); // true (content is same)
        System.out.println("str3.equals(str4): " + str3.equals(str4)); // true (content is same)

        // The intern() method explicitly adds a String to the String Pool (if not already there)
        String str5 = new String("Python").intern();
        String str6 = "Python";
        System.out.println("str5 == str6 (after intern()): " + (str5 == str6)); // true
    }

}
