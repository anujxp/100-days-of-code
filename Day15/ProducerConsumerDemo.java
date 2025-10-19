// ProducerConsumerDemo.java
// Classic producer-consumer using wait() / notify()
// Single-slot buffer for simplicity
import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumerDemo {
    public static void main(String[] args) {
        System.out.println("== ProducerConsumerDemo ==");
        Buffer buffer = new Buffer(5);
        Thread producer = new Thread(new Producer(buffer), "Producer");
        Thread consumer = new Thread(new Consumer(buffer), "Consumer");
        producer.start();
        consumer.start();
    }
}

class Buffer {
    private final Queue<Integer> q = new LinkedList<>();
    private final int capacity;

    Buffer(int capacity) { this.capacity = capacity; }

    public synchronized void put(int value) throws InterruptedException {
        while (q.size() == capacity) wait();
        q.add(value);
        notifyAll();
    }

    public synchronized int take() throws InterruptedException {
        while (q.isEmpty()) wait();
        int v = q.poll();
        notifyAll();
        return v;
    }
}

class Producer implements Runnable {
    private final Buffer buffer;
    Producer(Buffer buffer) { this.buffer = buffer; }

    @Override public void run() {
        for (int i=1;i<=20;i++) {
            try {
                buffer.put(i);
                System.out.println(Thread.currentThread().getName() + " produced " + i);
                Thread.sleep(80);
            } catch (InterruptedException ignored) {}
        }
    }
}

class Consumer implements Runnable {
    private final Buffer buffer;
    Consumer(Buffer buffer) { this.buffer = buffer; }

    @Override public void run() {
        for (int i=1;i<=20;i++) {
            try {
                int v = buffer.take();
                System.out.println(Thread.currentThread().getName() + " consumed " + v);
                Thread.sleep(120);
            } catch (InterruptedException ignored) {}
        }
    }
}
