// RunnableDemo.java
// Example: create a thread by implementing Runnable (preferred in many cases)
public class RunnableDemo {
    public static void main(String[] args) {
        System.out.println("== RunnableDemo ==");
        Thread t1 = new Thread(new Worker("R-1"));
        Thread t2 = new Thread(new Worker("R-2"));
        t1.start();
        t2.start();
    }
}

class Worker implements Runnable {
    private final String name;
    Worker(String name) { this.name = name; }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(name + " processed item " + i);
            try { Thread.sleep(150); } catch (InterruptedException ignored) {}
        }
    }
}
