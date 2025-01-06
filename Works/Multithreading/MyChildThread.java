
public class MyChildThread extends Thread{
    public MyChildThread(String ThreadName){
        setName(ThreadName);
    }
    
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println(getName()+" : " +i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
    
}
