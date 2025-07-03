package chapter5.concurrency.producer_consumer;

public class Producer implements Runnable {
    private SharedResource resource;
    private int itemCount;

    public Producer(SharedResource newResource, int itemCount){
        this.itemCount = itemCount;
        this.resource = newResource;
    }

    @Override
    public void run(){
        for(int i = 1; i<=itemCount; i++){
        try {
            resource.put("Item no." + i);
            }
         catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return;
        }
    }
}


}
