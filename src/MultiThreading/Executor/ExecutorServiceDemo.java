package MultiThreading.Executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceDemo {

    public static void main(String[] args) {

        ExecutorService es = Executors.newCachedThreadPool();

        es.execute(() -> System.out.println(Thread.currentThread().getName()));
        es.execute(() -> System.out.println(Thread.currentThread().getName()));
    }
}
