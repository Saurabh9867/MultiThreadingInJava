package MultiThreading.waitANDnotifyAll;

public class Reader implements Runnable{

    private Message message;

    Reader(Message message){
        this.message = message;
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        synchronized (message){
            try {
                System.out.println(threadName + " will be now in wait state");
                message.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Message from is: " + message.getMsg());
            System.out.println("Reader block: " + threadName + ": Completed");
        }
    }
}
