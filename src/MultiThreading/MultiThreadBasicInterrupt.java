package MultiThreading;

public class MultiThreadBasicInterrupt {
    public static void main(String[] args) throws InterruptedException{

        defaultRunnableInterrupt runnable = new defaultRunnableInterrupt();
        Thread thread = new Thread(runnable);

        thread.start();

        Thread.sleep(1);
        //TimeUnit.SECONDS.sleep(1);

        System.out.println("Thread has been hold because of SLEEP after 0.5 sec");
        System.out.println("hello");
        thread.interrupt();
        //thread.join();
        System.out.println("Thread is exiting main method");
    }
}
