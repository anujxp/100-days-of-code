// WaitNotifyDemo.java
// Demonstrates wait() and notify() for inter-thread coordination (single producer/consumer signal)

public class WaitNotifyDemo {
    public static void main(String[] args) {
        System.out.println("== WaitNotifyDemo ==");
        final Object monitor = new Object();
        final SharedFlag flag = new SharedFlag();

        Thread waiter = new Thread(() -> {
            synchronized (monitor) {
                while (!flag.ready) {
                    System.out.println("Waiter: not ready, calling wait()");
                    try {
                        monitor.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                }
                System.out.println("Waiter: notified and proceeding");
            }
        }, "Waiter");

        Thread notifier = new Thread(() -> {
            sleepMillis(800);
            synchronized (monitor) {
                flag.ready = true;
                System.out.println("Notifier: set ready=true and calling notify()");
                monitor.notify(); // wakes one waiting thread
            }
        }, "Notifier");

        waiter.start();
        notifier.start();
    }

    static class SharedFlag {
        volatile boolean ready = false; // volatile to ensure visibility
    }

    private static void sleepMillis(long ms) {
        try { Thread.sleep(ms); } catch (InterruptedException ignored) {}
    }
}
