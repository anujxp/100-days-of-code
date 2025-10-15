// ThrowThrowsDemo.java
// Demonstrates throw (explicit) and throws (declaration)
// Compile: javac ThrowThrowsDemo.java
// Run:     java ThrowThrowsDemo

public class ThrowThrowsDemo {
    public static void main(String[] args) {
        System.out.println("=== throw vs throws Demo ===");
        try {
            validateAge(16); // will throw
        } catch (Exception e) {
            System.out.println("Handled in caller: " + e.getMessage());
        }

        try {
            mayThrowChecked(true);
        } catch (Exception e) {
            System.out.println("Checked exception handled in main: " + e.getMessage());
        }
    }

    // throws: method declares it may throw Exception (checked)
    static void mayThrowChecked(boolean doThrow) throws Exception {
        if (doThrow) {
            throw new Exception("Explicit checked exception from mayThrowChecked");
        }
        System.out.println("no checked exception thrown");
    }

    // throw: explicitly throwing a runtime exception (unchecked)
    static void validateAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or older");
        }
        System.out.println("Age is valid");
    }
}
