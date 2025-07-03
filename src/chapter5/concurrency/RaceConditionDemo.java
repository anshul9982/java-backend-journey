package chapter5.concurrency;

public class RaceConditionDemo {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        CounterTask c1 = new CounterTask(counter);
        CounterTask c2 = new CounterTask(counter);
        CounterTask c3 = new CounterTask(counter);

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        Thread t3 = new Thread(c3);

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println(counter.getCount());
        

    }

}
