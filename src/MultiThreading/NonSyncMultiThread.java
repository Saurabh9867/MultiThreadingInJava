package MultiThreading;

import java.util.ArrayList;
import java.util.List;

public class NonSyncMultiThread {
    public static int counter = 0;

    public static void main(String[] args) throws InterruptedException{
        List<Thread> threadList = new ArrayList<>();
        int maxCounter = 100000;
        for(int i = 0; i < maxCounter; i++){
            Thread t = new Thread(NonSyncMultiThread::increment);
            threadList.add(t);
            t.start();
        }
        for(Thread thread:threadList){
            thread.join();
        }
        System.out.println(counter);
    }

//    public synchronized static void increment(){
//        counter++;
//    }

    public static void increment(){
        System.out.println("Print statement which can be executed concurrently");
        synchronized (NonSyncMultiThread.class){
            counter++;
        }
    }

}
