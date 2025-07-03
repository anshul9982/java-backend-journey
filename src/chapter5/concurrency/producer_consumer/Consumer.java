package chapter5.concurrency.producer_consumer;

public class Consumer implements Runnable {

    private SharedResource resource;
    private int itemCount;

    public Consumer(SharedResource resource, int itemCount){
        this.itemCount = itemCount;
        this.resource = resource;
    }
    @Override
    public void run(){
        for(int i =1; i<=itemCount; i++){
            try {
                String item = resource.get();
                System.out.println("Consumed Item : " + item);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }


}
