// ThreadExtendsDemo.java
// Example: create a thread by extending Thread
class ThreadExtendsDemo {
    public static void main(String[] args) {
        System.out.println("== ThreadExtendsDemo ==");
        MyThread t1 = new MyThread("T-Ext-1");
        MyThread t2 = new MyThread("T-Ext-2");
        t1.start();
        t2.start();
    }
}

class MyThread extends Thread {
    private final String name;
    MyThread(String name) { this.name = name; }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(name + " -> step " + i);
            try { Thread.sleep(120); } catch (InterruptedException ignored) {}
        }
    }
}
