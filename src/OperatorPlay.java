public class OperatorPlay {
    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 50; // Changed num2 to 50 for more varied relational outcomes
        int num3 = 7; // For demonstrating increment/decrement

        boolean isLegal = true;
        boolean shouldYouDoIt = false;

        System.out.println("--- Arithmetic Operations ---");
        System.out.println("Addition (num1 + num2): " + (num1 + num2)); // 100 + 50 = 150
        System.out.println("Subtraction (num1 - num2): " + (num1 - num2)); // 100 - 50 = 50
        System.out.println("Multiplication (num1 * num2): " + (num1 * num2)); // 100 * 50 = 5000
        System.out.println("Division (num1 / num2): " + (num1 / num2)); // 100 / 50 = 2
        System.out.println("Modulus (num1 % num2): " + (num1 % num2)); // 100 % 50 = 0

        System.out.println("\n--- Relational (Comparison) Operations ---");
        System.out.println("num1 == num2: " + (num1 == num2)); // false (100 == 50)
        System.out.println("num1 != num2: " + (num1 != num2)); // true (100 != 50)
        System.out.println("num1 > num2: " + (num1 > num2));   // true (100 > 50)
        System.out.println("num1 < num2: " + (num1 < num2));   // false (100 < 50)
        System.out.println("num1 >= num2: " + (num1 >= num2)); // true (100 >= 50)
        System.out.println("num1 <= num2: " + (num1 <= num2)); // false (100 <= 50)


        System.out.println("\n--- Logical Operations ---");
        System.out.println("isLegal && shouldYouDoIt: " + (isLegal && shouldYouDoIt)); // true && false = false
        System.out.println("isLegal || shouldYouDoIt: " + (isLegal || shouldYouDoIt)); // true || false = true
        System.out.println("!isLegal: " + (!isLegal)); // !true = false


        System.out.println("\n--- Assignment Operators ---");
        int assignValue = 20;
        System.out.println("Initial assignValue: " + assignValue); // 20
        assignValue += 5; // assignValue = 20 + 5 = 25
        System.out.println("assignValue after += 5: " + assignValue); // 25
        assignValue *= 2; // assignValue = 25 * 2 = 50
        System.out.println("assignValue after *= 2: " + assignValue); // 50


        System.out.println("\n--- Unary (Increment/Decrement) Operators ---");
        int preIncrement = num3; // preIncrement = 7
        System.out.println("Original num3: " + num3); // 7
        System.out.println("Value of ++preIncrement: " + (++preIncrement)); // preIncrement becomes 8, then value is 8
        System.out.println("preIncrement after ++: " + preIncrement); // 8

        int postIncrement = num3; // postIncrement = 8 (from previous operation)
        System.out.println("Original num3 (for post-increment demo): " + postIncrement); // 8
        System.out.println("Value of postIncrement++: " + (postIncrement++)); // Value is 8, then postIncrement becomes 9
        System.out.println("postIncrement after ++: " + postIncrement); // 9

        // Similar for decrement (optional for this exercise, but good to know)
        // int preDecrement = 10;
        // System.out.println("Value of --preDecrement: " + (--preDecrement)); // 9
        // System.out.println("preDecrement after --: " + preDecrement); // 9


        System.out.println("\n--- Ternary (Conditional) Operator ---");
        String result = (num1 > num2) ? "num1 is greater" : "num2 is greater or equal";
        System.out.println("Ternary check (num1 > num2): " + result); // num1 is greater (100 > 50)

        int examScore = 75;
        String grade = (examScore >= 90) ? "A" : (examScore >= 80) ? "B" : (examScore >= 70) ? "C" : "D";
        System.out.println("Exam Grade: " + grade); // C (example of nested ternary)
    }
}