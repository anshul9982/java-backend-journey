package chapter7;

public class LambdaConversiobDemo {
    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("Lambda expression conversion from anonymous class completed");

        Thread newThread = new Thread(runnable);
        newThread.start();
    }

}
