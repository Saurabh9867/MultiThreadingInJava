package MultiThreading.Executor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class InvokeAllDemo {
    public static void main(String[] args) throws InterruptedException{

        ExecutorService es = Executors.newCachedThreadPool();

        List<Callable<String>> callableThreads = new ArrayList<>(Arrays.asList(
                () -> "Thread1",
                () -> "Thread2",
                () -> "Thread3"
        ));

        List<Future<String>> futureList = es.invokeAll(callableThreads);

        futureList.stream()
                .map(future -> {
                    try {
                        return future.get();
                    } catch (InterruptedException | ExecutionException e) {
                        e.printStackTrace();
                    }
                    return "";
                })
                .forEach(System.out::println);
    }
}
