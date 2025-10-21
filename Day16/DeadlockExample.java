// DeadlockExample.java
// Simple demonstration of deadlock: two threads acquiring locks in opposite order

public class DeadlockExample {
    public static void main(String[] args) {
        System.out.println("== DeadlockExample ==");
        final Object lock1 = new Object();
        final Object lock2 = new Object();

        Thread t1 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("Thread-1: locked lock1");
                sleepMillis(200);
                System.out.println("Thread-1: waiting for lock2");
                synchronized (lock2) {
                    System.out.println("Thread-1: locked lock2");
                }
            }
        }, "Thread-1");

        Thread t2 = new Thread(() -> {
            synchronized (lock2) {
                System.out.println("Thread-2: locked lock2");
                sleepMillis(200);
                System.out.println("Thread-2: waiting for lock1");
                synchronized (lock1) {
                    System.out.println("Thread-2: locked lock1");
                }
            }
        }, "Thread-2");

        t1.start();
        t2.start();
    }

    private static void sleepMillis(long ms) {
        try { Thread.sleep(ms); } catch (InterruptedException ignored) {}
    }
}
