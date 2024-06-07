package MultiThreading;

public class defaultRunnableInterrupt implements Runnable{

    @Override
    public void run(){
        while(Thread.currentThread().isInterrupted() == false){
            System.out.println("Thread is Running...");
        }
        System.out.println("Thread is executed for 0.5 second");
    }
}
