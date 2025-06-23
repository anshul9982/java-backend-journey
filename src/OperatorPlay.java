public class OperatorPlay {
    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 500;
        boolean isLegal = true;
        boolean shouldYouDoIt = false;
        System.out.println("addition : " + (num1+num2));
        System.out.println("subtraction : " + (num2-num1));
        System.out.println("equal or not : " + (num2==num1));
        System.out.println("greater or not : " + (num2<num1));
        System.out.println("do it or not : " + (isLegal&&shouldYouDoIt));
        System.out.println("greater or not : " + (num2<num1));
        String result = ((num1 > 50) ? "yes" : "no" );



    }
}
