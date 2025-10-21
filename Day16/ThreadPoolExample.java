// ThreadPoolExample.java
// Illustrates using a fixed thread pool (ExecutorService) to handle multiple tasks

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExample {
    public static void main(String[] args) {
        System.out.println("== ThreadPoolExample ==");
        ExecutorService pool = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 8; i++) {
            final int id = i;
            pool.execute(() -> {
                System.out.println(Thread.currentThread().getName() + " processing job " + id);
                try { Thread.sleep(400); } catch (InterruptedException ignored) {}
                System.out.println(Thread.currentThread().getName() + " finished job " + id);
            });
        }

        pool.shutdown();
        try {
            if (!pool.awaitTermination(5, TimeUnit.SECONDS)) {
                pool.shutdownNow();
            }
        } catch (InterruptedException e) {
            pool.shutdownNow();
            Thread.currentThread().interrupt();
        }

        System.out.println("All tasks handled by thread pool (or timed out).");
    }
}
