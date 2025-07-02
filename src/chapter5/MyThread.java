package chapter5;

public class MyThread extends Thread{

    private String threadName;

    public MyThread(String name){
        this.threadName = name;
        System.out.println("Creating a new thread");
    }

    @Override
    public void run(){
        System.out.println("thread " + threadName + " started running ");
        try {
            for(int i = 1; i <= 5; i++){
                System.out.println("thread ran, times : " + i);
                Thread.sleep(70);
            }
        } catch (Exception e) {
            System.out.println(threadName + " interrupted ");
        }

        System.out.println(threadName + " exiting ");
    }

}
