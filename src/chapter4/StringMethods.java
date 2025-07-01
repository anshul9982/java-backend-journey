package chapter4;

public class StringMethods {
    public static void main(String[] args) {
        System.out.println("\n--- Demonstrating Common String Methods ---");
        String message = " Hello Java!, How you all been doing? ";
        String fileName = "report.txt";
        String keyword = "Java";

        System.out.println("length of the string message before trimming : "+ message.length());
        message.trim();
        System.out.println(message);
        System.out.println("length of the string message after trimming : " + message.length());

        String convertedMessage = message.toUpperCase();
        System.out.println(convertedMessage);

        System.out.println("does string message contain the keyword java? : " + message.contains(keyword));
        System.out.println("does the string message stard with hello? : " + message.startsWith("Hello"));
        System.out.println("does the string fileName end with .txt? " + fileName.endsWith(".txt"));

        System.out.println("the first occurance of o in message : "+ message.indexOf("o"));
        System.out.println("the first occurance of o in message : "+ message.indexOf(keyword));
        System.out.println("the last occurance of o in message : " + message.lastIndexOf("o"));

        System.out.println("substring of message from indext 6 to end : "+ message.substring(6));
        System.out.println("substring of message from indext 6 to 10 : "+ message.substring(6, 10));

        String replacedMessage = convertedMessage.replace("JAVA", "PYTHON");
        System.out.println(replacedMessage);

        String data = "apple, banana, cherry, mango, watermelon, guava";
        String[] fruits = data.split(",");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println(message.charAt(0));
        System.out.println(String.valueOf(123));
        System.out.println(String.valueOf(true));


    }


}
