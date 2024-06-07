package MultiThreading.waitANDnotifyAll;

import java.util.concurrent.Executor;

public class main {
    public static void main(String[] args) {

        Message message = new Message("Hello");

        Reader reader1 = new Reader(message);
        new Thread(reader1, "Reader_1").start();

        Reader reader2 = new Reader(message);
        new Thread(reader2, "Reader_2").start();

        Notifier notifier = new Notifier(message);
        new Thread(notifier, "Notifier").start();

        System.out.println("Main method thread is captured");
    }
}
