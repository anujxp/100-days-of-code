
// TryCatchFinallyDemo.java
// Demonstrates try / catch / finally basic flow
// Compile: javac TryCatchFinallyDemo.java
// Run:     java TryCatchFinallyDemo

class TryCatchFinallyDemo {
    public static void main(String[] args) {
        System.out.println("=== Try-Catch-Finally Demo ===");

        try {
            System.out.println("Inside try: preparing risky operation.");
            int x = 10 / 0; // will throw ArithmeticException
            System.out.println("This line will not run: " + x);
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught general Exception: " + e.getMessage());
        } finally {
            System.out.println("Finally always runs (cleanup here).");
        }

        System.out.println("After try/catch/finally.");
    }
