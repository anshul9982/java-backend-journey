package chapter5.concurrency;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorDemo {
    public static void main(String[] args) {
        Counter sharedCounter = new Counter();

        ExecutorService executor = Executors.newFixedThreadPool(2);
        for(int i = 0; i<5; i++){
            executor.execute(new CounterTask(sharedCounter));
        }

        executor.shutdown();

        try {
            executor.awaitTermination(30, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            System.out.println("Task Interruped ");
            Thread.currentThread().interrupt();
        }

        System.out.println(sharedCounter.getCount());
    }

}
