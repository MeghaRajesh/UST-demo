public class PriorityThread1 extends Thread{
    long counter;
    public PriorityThread1(String threadName,int threadPriority){
        setName(threadName);
        setPriority(threadPriority);
        start();
    }

    public void run(){
        while (true) { 
            counter++;
        }
    }
    
}
