package chapter5.concurrency;

public class ConcurrencyDemo {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread("Thread-1");
        thread1.start();

        MyRunnable task1 = new MyRunnable("Task-1");
        Thread thread2 = new Thread(task1);
        thread2.start();


    }

}
