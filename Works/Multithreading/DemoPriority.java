public class DemoPriority {
    public static void main(String[] args) {
        PriorityThread1 pt1=new PriorityThread1("One",Thread.MIN_PRIORITY);
        PriorityThread1 pt2=new PriorityThread1("Two",Thread.MAX_PRIORITY);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        pt1.stop();
        pt2.stop();
        System.out.println(pt1.counter);
        System.out.println(pt2.counter);
    }
    
}
