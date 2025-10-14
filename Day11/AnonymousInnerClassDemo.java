// AnonymousInnerClassDemo.java
// Demonstrates anonymous inner class usage
// Run: javac AnonymousInnerClassDemo.java && java AnonymousInnerClassDemo

interface Task {
    void execute();
}

public class AnonymousInnerClassDemo {
    public static void main(String[] args) {
        System.out.println("=== Anonymous Inner Class Demo ===");

        // Anonymous implementation of Task
        Task t = new Task() {
            @Override
            public void execute() {
                System.out.println("Running task inside anonymous inner class.");
            }
        };
        t.execute();

        // Older style thread creation with anonymous Runnable
        Thread th = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread running (anonymous Runnable).");
            }
        });
        th.start();

        // Wait for thread briefly (not necessary in production)
        try { th.join(); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
    }
}
