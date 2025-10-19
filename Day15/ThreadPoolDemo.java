// ThreadPoolDemo.java
// Use ExecutorService (thread pool) to simulate a server handling incoming requests
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
class ThreadPoolDemo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("== ThreadPoolDemo ==");
        ExecutorService pool = Executors.newFixedThreadPool(4); // 4 worker threads

        for (int i = 1; i <= 12; i++) {
            final int reqId = i;
            pool.execute(() -> {
                System.out.println("Handling request #" + reqId + " on " + Thread.currentThread().getName());
                try { Thread.sleep(400); } catch (InterruptedException ignored) {}
                System.out.println("Completed request #" + reqId + " on " + Thread.currentThread().getName());
            });
        }

        pool.shutdown();
        pool.awaitTermination(5, TimeUnit.SECONDS);
        System.out.println("All requests processed (or timed out).");
    }
}
