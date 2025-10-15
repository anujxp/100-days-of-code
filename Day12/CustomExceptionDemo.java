// CustomExceptionDemo.java
// Demonstrates defining and using a custom exception type
// Compile: javac CustomExceptionDemo.java
// Run:     java CustomExceptionDemo

class InvalidOrderException extends Exception {
    public InvalidOrderException(String message) {
        super(message);
    }
}

public class CustomExceptionDemo {
    public static void main(String[] args) {
        System.out.println("=== Custom Exception Demo ===");
        try {
            processOrder(-5);
        } catch (InvalidOrderException e) {
            System.out.println("Caught custom exception: " + e.getMessage());
        }
    }

    static void processOrder(int quantity) throws InvalidOrderException {
        if (quantity <= 0) {
            throw new InvalidOrderException("Order quantity must be positive. Given: " + quantity);
        }
        System.out.println("Processing order for quantity: " + quantity);
    }
}
