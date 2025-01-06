
public class Demo2 {
    public static void main(String[] args) {
        Thread t=Thread.currentThread();
        MyChildThread ct=new MyChildThread("ChildOne");
        MyChildThread ct1=new MyChildThread("ChildTwo");
        MyChildThread2 ct2=new MyChildThread2("ChildThree");
        //here thread is created at os level
        //start method call run method 
        ct.start();
        ct1.start();
        ct2.th.start();
        for (int i = 0; i < 5; i++) {
            System.out.println(t.getName()+" : " +i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
        }
    }
    }
    
}
