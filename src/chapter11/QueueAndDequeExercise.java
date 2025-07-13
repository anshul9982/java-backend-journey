package chapter11;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class QueueAndDequeExercise {
    public static void main(String[] args) {
        Queue<String> exampleQueue = new ArrayDeque<>();
        exampleQueue.offer("Download File");
        exampleQueue.offer("Process Image");
        exampleQueue.offer("Send Email");
        exampleQueue.offer("Update DB");
        exampleQueue.offer("Generate Report");

        System.out.println(exampleQueue.peek());

        exampleQueue.poll();
        exampleQueue.poll();
        exampleQueue.poll();

        System.out.println(exampleQueue.size());
        System.out.println(exampleQueue);

        exampleQueue.offer("task1");
        exampleQueue.offer("task2");
        while (exampleQueue.size()!=0) {
            exampleQueue.poll();
        }
        System.out.println(exampleQueue);

        System.out.println("-----------///////-------------");     
        System.out.println(" ");
        
        Deque<String> browserHistory = new ArrayDeque<>();
        browserHistory.push("home.com");
        browserHistory.push("products.com");
        browserHistory.push("details.com");
        browserHistory.push("cart.com");

        browserHistory.pop();
        System.out.println("current page : " + browserHistory.peek());
        browserHistory.pop();
        System.out.println("current page " + browserHistory.peek());

        browserHistory.addLast("checkout.com");
        System.out.println(browserHistory);
        




    }

}
