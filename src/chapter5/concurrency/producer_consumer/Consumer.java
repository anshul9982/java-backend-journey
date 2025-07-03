package chapter5.concurrency.producer_consumer;

public class Consumer implements Runnable {

    private SharedResource newResource;
    private int itemCount;

    public Consumer(SharedResource resource, int itemCount){
        this.itemCount = itemCount;
        this.newResource = resource;
    }
    @Override
    public void run(){
        for(int i = 1; i<itemCount; i++){
            try {
                newResource.get();
                System.out.println("Consumed Item : " + i);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }


}
