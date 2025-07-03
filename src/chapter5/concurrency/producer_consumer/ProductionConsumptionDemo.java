package chapter5.concurrency.producer_consumer;

public class ProductionConsumptionDemo {
    public static void main(String[] args) throws InterruptedException {
        SharedResource resource = new SharedResource();
        Producer producer = new Producer(resource, 5);
        Consumer consumer = new Consumer(resource, 5);
        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);

        producerThread.start();
        consumerThread.start();

        producerThread.join();
        consumerThread.join();

        System.out.println("demo finished");
    }

}
