package MultiThreading.waitANDnotifyAll;

import java.util.concurrent.TimeUnit;

public class Notifier implements Runnable{

    private Message message;

    Notifier(Message message){
        this.message = message;
    }

    @Override
    public void run(){
        String notifierName = Thread.currentThread().getName();
        System.out.println("Notifier : " + notifierName + " has started!!");
        try{
            TimeUnit.MILLISECONDS.sleep(100);
            synchronized (message) {
                message.setMsg("Hello World");
                message.notifyAll();
            }
        }
        catch (InterruptedException e){
            System.out.println(e);
        }
        System.out.println("Notifier Block : " + notifierName + " completed");
    }
}
