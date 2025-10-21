// JoinDemo.java
// Simple demo showing Thread.join() usage (main waits for worker to finish)

public class JoinDemo {
    public static void main(String[] args) {
        System.out.println("== JoinDemo ==");
        Thread worker = new Thread(() -> {
            System.out.println("Worker: starting long task...");
            try { Thread.sleep(1200); } catch (InterruptedException ignored) {}
            System.out.println("Worker: task finished.");
        }, "Worker");

        worker.start();

        System.out.println("Main: waiting for worker to finish using join()");
        try {
            worker.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Main: worker has finished, continuing.");
    }
}

