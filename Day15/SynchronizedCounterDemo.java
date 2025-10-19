// SynchronizedCounterDemo.java
// Demonstrates protecting shared state using synchronized
public class SynchronizedCounterDemo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("== SynchronizedCounterDemo ==");
        SafeCounter counter = new SafeCounter();

        Thread t1 = new Thread(() -> { for (int i=0;i<1000;i++) counter.increment(); });
        Thread t2 = new Thread(() -> { for (int i=0;i<1000;i++) counter.increment(); });

        t1.start(); t2.start();
        t1.join(); t2.join();

        System.out.println("Final counter value (expected 2000): " + counter.get());
    }
}

class SafeCounter {
    private int value = 0;
    public synchronized void increment() {
        value++;
    }
    public synchronized int get() { return value; }
}
