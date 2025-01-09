
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        Queue<String> allTasks=new PriorityQueue();
        //create
        allTasks.offer("Call friend");
        allTasks.offer("Finish Laundry");
        allTasks.offer("Shopping");
        

        //read
        allTasks.forEach((task)->System.out.println(task));
        System.out.println("-------------");

        //delete
        allTasks.poll();
        allTasks.forEach((task)->System.out.println(task));
        System.out.println("-------------");
    }
    
}
