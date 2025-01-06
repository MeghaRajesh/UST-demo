public class Demo1 {
    //creating threads
    //1.extends thread
    //2.implements runnable
    public static void main(String[] args) {
        Thread t=Thread.currentThread();
        System.out.println("Thread Name : "+t.getName());
        System.out.println("Thread priority: "+t.getPriority());
        System.out.println("Thread is alive: "+t.isAlive());
        System.out.println("Thread is demon: "+t.isDaemon());
        System.out.println("Thread state: "+t.getState());
        System.out.println("Thread group: "+t.getThreadGroup());
        System.out.println("Thread Min Priority: "+Thread.MIN_PRIORITY);
        System.out.println("Thread Max Priority: "+Thread.MAX_PRIORITY);
        System.out.println("Thread Norm Priority: "+Thread.NORM_PRIORITY);
    }
    
}
