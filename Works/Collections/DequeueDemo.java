import java.util.ArrayDeque;
import java.util.Deque;

public class DequeueDemo {
    public static void main(String[] args) {
        Deque<Integer> nums=new ArrayDeque<>();
        nums.offerLast(4);
        nums.offerLast(3);
        nums.offerFirst(2);
        nums.offerLast(1);
        nums.offerFirst(5);
        nums.offerLast(10);

        nums.forEach((no)->System.out.println(no));
        System.out.println("-------------");
        nums.pollFirst();
        nums.forEach((no)->System.out.println(no));
        System.out.println("-------------");
        nums.pollLast();
        nums.forEach((no)->System.out.println(no));
    }
    
}
