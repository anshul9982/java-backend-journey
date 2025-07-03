package chapter5.concurrency;

public class CounterTask implements Runnable {
    
    private Counter sharedCounter;
    public CounterTask(Counter counter){
        this.sharedCounter = counter;
    }

    @Override
    public void run(){
        for(int i = 1; i<=1000; i++){
            sharedCounter.increment();
        }
    }



}
