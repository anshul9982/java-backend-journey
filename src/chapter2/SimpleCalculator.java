package chapter2;

import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.println("enter number 1 : ");
            double num1 = scanner.nextDouble();
            System.out.println("enter number 2 : ");
            double num2 = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("choose your desired operation :");
            String operation = scanner.nextLine();

            switch (operation){
                case "+":
                    System.out.println(num1+num2);
                    break;
                case "-":
                    System.out.println(num1-num2);
                    break;
                case "*":
                    System.out.println(num1*num2);
                    break;
                case "/":
                    if (num2==0){
                        System.out.println("division by zero not allowed!");
                    }
                    else{
                        System.out.println(num1/num2);
                    }
                    break;
                default:
                    System.out.println("enter a valid operator");
            }
        }
    }
}
