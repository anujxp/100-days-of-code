// SynchronizedExample.java
// Demonstrates protecting shared state using synchronized methods/blocks

public class SynchronizedExample {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("== SynchronizedExample ==");

        SafeAccount account = new SafeAccount();
        Thread depositor = new Thread(() -> {
            for (int i = 0; i < 1000; i++) account.deposit(1);
        }, "Depositor");

        Thread withdrawer = new Thread(() -> {
            for (int i = 0; i < 1000; i++) account.deposit(1);
        }, "WithdrawerSim");

        depositor.start();
        withdrawer.start();

        depositor.join();
        withdrawer.join();

        System.out.println("Expected balance: 2000, Actual balance: " + account.getBalance());
    }
}

class SafeAccount {
    private int balance = 0;

    // synchronized ensures only one thread can execute this at a time
    public synchronized void deposit(int amount) {
        int current = balance;
        // simulate some processing
        try { Thread.sleep(0, 500000); } catch (InterruptedException ignored) {}
        balance = current + amount;
    }

    public synchronized int getBalance() {
        return balance;
    }
}
