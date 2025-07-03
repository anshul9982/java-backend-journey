package chapter5.concurrency;

public class MyStateObservingTask implements Runnable {

    public void run(){
        try {
            System.out.println("thread before sleeping 100 milis");
            Thread.sleep(100);
            System.out.println("thread after sleeping 100 milis ");
        } catch (Exception e) {
            System.out.println("thread interrupted");
            Thread.currentThread().interrupt();

            
        }
    }


}
