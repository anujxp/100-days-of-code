/*
 PaymentGatewayExample.java
 Day 10 — Real-world example using Interfaces and Polymorphism
 - Defines a PaymentGateway interface (the contract)
 - Multiple implementations: Razorpay, Paytm, Stripe
 - Demonstrates polymorphism: treat different gateways uniformly
 - Shows a simple switching example based on a gateway name
 Compile:
   javac PaymentGatewayExample.java
 Run:
   java PaymentGatewayExample
*/

import java.util.Random;

interface PaymentGateway {
    // The contract every gateway must implement
    boolean processPayment(String transactionId, double amount);
    String getName();
}

// Implementation 1
class Razorpay implements PaymentGateway {
    private Random rnd = new Random();
    public boolean processPayment(String transactionId, double amount) {
        System.out.printf("[%s] Processing %.2f for tx=%s ...%n", getName(), amount, transactionId);
        // simulated success/failure
        boolean success = rnd.nextDouble() > 0.10; // 90% success
        System.out.println("Result: " + (success ? "SUCCESS" : "FAILED"));
        return success;
    }
    public String getName() { return "Razorpay"; }
}

// Implementation 2
class Paytm implements PaymentGateway {
    private Random rnd = new Random();
    public boolean processPayment(String transactionId, double amount) {
        System.out.printf("[%s] Processing %.2f for tx=%s ...%n", getName(), amount, transactionId);
        boolean success = rnd.nextDouble() > 0.15; // 85% success
        System.out.println("Result: " + (success ? "SUCCESS" : "FAILED"));
        return success;
    }
    public String getName() { return "Paytm"; }
}

// Implementation 3
class Stripe implements PaymentGateway {
    private Random rnd = new Random();
    public boolean processPayment(String transactionId, double amount) {
        System.out.printf("[%s] Processing %.2f for tx=%s ...%n", getName(), amount, transactionId);
        boolean success = rnd.nextDouble() > 0.12; // 88% success
        System.out.println("Result: " + (success ? "SUCCESS" : "FAILED"));
        return success;
    }
    public String getName() { return "Stripe"; }
}

class PaymentGatewayExample {
    // Factory method — simple selector returning PaymentGateway by name
    public static PaymentGateway getGateway(String name) {
        if (name == null) return null;
        switch (name.toLowerCase()) {
            case "razorpay": return new Razorpay();
            case "paytm":    return new Paytm();
            case "stripe":   return new Stripe();
            default: return null;
        }
    }

    public static void simulateCheckout(PaymentGateway gateway, String txId, double amount) {
        if (gateway == null) {
            System.out.println("No gateway provided.");
            return;
        }
        System.out.println("--- Checkout using " + gateway.getName() + " ---");
        boolean ok = gateway.processPayment(txId, amount);
        if (ok) System.out.println("Payment completed via " + gateway.getName());
        else System.out.println("Payment failed via " + gateway.getName() + " — please retry.");
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("=== Payment Gateway Polymorphism Demo ===");

        // Create different gateways using factory (we only hold PaymentGateway reference)
        PaymentGateway g1 = getGateway("Razorpay");
        PaymentGateway g2 = getGateway("Paytm");
        PaymentGateway g3 = getGateway("Stripe");

        // Use them uniformly — polymorphism in action
        simulateCheckout(g1, "TXN1001", 1499.99);
        simulateCheckout(g2, "TXN1002", 250.00);
        simulateCheckout(g3, "TXN1003", 49.95);

        // Example: choose gateway at runtime (string comes from config or user choice)
        String choice = "paytm"; // could be dynamic
        PaymentGateway chosen = getGateway(choice);
        simulateCheckout(chosen, "TXN2001", 799.00);
    }
}
