package MultiThreading;

public class MultiThreadBasic {
    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName());

        Runnable runnable = new defaultRunnable();

        Thread t1 = new Thread(runnable);

        Thread t2 = new Thread(new Runnable(){
            @Override
            public void run(){
                System.out.println("Active thread is " + Thread.currentThread().getName());
            }
        });

        Thread t3 = new Thread(() -> System.out.println("Active thread is " + Thread.currentThread().getName()));

        t1.start();
        t2.start();
        t3.start();

    }
}
