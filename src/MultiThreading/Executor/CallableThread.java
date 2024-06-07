package MultiThreading.Executor;

import java.util.concurrent.*;

public class CallableThread {
    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {

        ExecutorService es = Executors.newCachedThreadPool();
        Future<Integer> future = es.submit(() -> 2+2);
        System.out.println(future.get(2, TimeUnit.SECONDS));
    }
}
