// TryLockAvoidDeadlockDemo.java
// Demonstrates using ReentrantLock.tryLock() to avoid deadlock

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TryLockAvoidDeadlockDemo {
    public static void main(String[] args) {
        System.out.println("== TryLockAvoidDeadlockDemo ==");
        final Lock r1 = new ReentrantLock();
        final Lock r2 = new ReentrantLock();

        Runnable task1 = () -> {
            while (true) {
                boolean got1 = false, got2 = false;
                try {
                    got1 = r1.tryLock();
                    if (got1) {
                        System.out.println("Task1: acquired r1");
                        sleepMillis(100);
                        got2 = r2.tryLock();
                        if (got2) {
                            System.out.println("Task1: acquired r2 -> doing work");
                            break; // done
                        }
                    }
                } finally {
                    if (got2) r2.unlock();
                    if (got1) r1.unlock();
                }
                // back off and retry
                sleepMillis(50);
            }
            System.out.println("Task1: finished");
        };

        Runnable task2 = () -> {
            while (true) {
                boolean got2 = false, got1 = false;
                try {
                    got2 = r2.tryLock();
                    if (got2) {
                        System.out.println("Task2: acquired r2");
                        sleepMillis(100);
                        got1 = r1.tryLock();
                        if (got1) {
                            System.out.println("Task2: acquired r1 -> doing work");
                            break; // done
                        }
                    }
                } finally {
                    if (got1) r1.unlock();
                    if (got2) r2.unlock();
                }
                // back off and retry
                sleepMillis(50);
            }
            System.out.println("Task2: finished");
        };

        Thread t1 = new Thread(task1, "T-try-1");
        Thread t2 = new Thread(task2, "T-try-2");
        t1.start();
        t2.start();
    }

    private static void sleepMillis(long ms) {
        try { Thread.sleep(ms); } catch (InterruptedException ignored) {}
    }
}
