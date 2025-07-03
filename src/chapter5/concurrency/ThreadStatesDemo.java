package chapter5.concurrency;

public class ThreadStatesDemo {
    public static void main(String[] args)throws InterruptedException{
        MyStateObservingTask observedThread = new MyStateObservingTask();
        Thread thread = new Thread(observedThread);
        System.out.println(thread.getState());
        thread.start();
        System.out.println("state of thread just after start : "+ thread.getState());
        Thread.sleep(50);
        System.out.println("state of thread while its sleeping : "+ thread.getState());
        Thread.sleep(150);
        thread.join();
        System.out.println("state of the thread after using join : " + thread.getState());
        


    }

}
