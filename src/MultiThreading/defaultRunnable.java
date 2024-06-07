package MultiThreading;

public class defaultRunnable implements Runnable{

    @Override
    public void run(){
        System.out.println("Active thread is " + Thread.currentThread().getName());
    }
}
