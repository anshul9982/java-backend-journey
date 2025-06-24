package chapter1;

public class practice1 {
    public static void main(String[] args) {
        int a = 15;
        int b = 10;
        if (a > b) {
            System.out.println("A is greater");
        } else {
            System.out.println("B is greater");
        }

        switch (a) {
            case 10:
                System.out.println("Ten");
                break;
            default:
                System.out.println("Other");
        }
    }
}
