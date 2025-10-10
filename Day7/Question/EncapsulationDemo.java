package Question;

/*
 03_EncapsulationDemo.java
 Shows private fields, getters/setters, and validation.
*/
class Account {
    private String id;
    private double balance;
    public Account(String id, double initial) { this.id = id; this.balance = Math.max(0, initial); }
    public String getId() { return id; }
    public double getBalance() { return balance; }
    public void deposit(double amt) { if (amt>0) balance += amt; else System.out.println("Invalid deposit"); }
    public boolean withdraw(double amt) { if (amt>0 && amt<=balance) { balance -= amt; return true; } System.out.println("Insufficient or invalid"); return false; }
    public String toString() { return id + ":" + String.format("%.2f", balance); }
}
public class EncapsulationDemo {
    public static void main(String[] args) {
        System.out.println("--- 03_EncapsulationDemo ---");
        Account a = new Account("A100", 100.0);
        a.deposit(50); a.withdraw(30); a.withdraw(200);
        System.out.println(a);
    }
}
