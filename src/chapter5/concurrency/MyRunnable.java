package chapter5.concurrency;

public class MyRunnable implements Runnable {

    private String taskName;

    public MyRunnable(String name){
        this.taskName = name;
        System.out.println("Creating task : "+ taskName);
    }

    @Override
    public void run(){
        System.out.println("task : " + taskName + " started running");

        try {
            for(int i = 1; i <= 5; i++){
                System.out.println("task : " + taskName + " No." + i + " ran");
                Thread.sleep(50);
            }
        } catch (Exception e) {
            System.out.println(taskName + " has been interrupted ");
        }
        System.out.println("task " + taskName + " exiting");
    }

}
