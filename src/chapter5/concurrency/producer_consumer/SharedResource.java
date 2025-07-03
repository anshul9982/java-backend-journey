package chapter5.concurrency.producer_consumer;

public class SharedResource {
    private String item;
    private boolean isEmpty = true;

    public synchronized void put(String newItem) throws InterruptedException{
        while (!isEmpty) {
            System.out.println("Slot is FULL, Waiting!");
            wait();
        }
        this.item = newItem;
        isEmpty = false;
        System.out.println("producer has produced item : " + item);
        notifyAll();
    }

    public synchronized String get() throws InterruptedException{
        while (isEmpty) {
            System.out.println("Slot is Empty, Waiting!");
            wait();
        }
        String consumedItem = this.item;
        System.out.println("consumer has consumed the item : " + item);
        this.item = null;
        isEmpty = true;
        notifyAll();
        return consumedItem;
    }


}
