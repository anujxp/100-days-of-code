// CheckedUncheckedDemo.java
// Shows checked vs unchecked exceptions (IOException vs ArithmeticException)
// Compile: javac CheckedUncheckedDemo.java
// Run:     java CheckedUncheckedDemo

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class CheckedUncheckedDemo {
    public static void main(String[] args) {
        System.out.println("=== Checked vs Unchecked Demo ===");

        // Unchecked example (runtime)
        try {
            int a = 5 / 0; // throws ArithmeticException (unchecked)
            System.out.println(a);
        } catch (ArithmeticException e) {
            System.out.println("Caught unchecked exception: " + e.getMessage());
        }

        // Checked example (compile-time): reading a file
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("nonexistent-file.txt")); // FileNotFoundException (checked)
            String line = br.readLine();
            System.out.println(line);
        } catch (IOException e) {
            System.out.println("Caught checked exception (I/O): " + e.getMessage());
        } finally {
            // cleanup
            if (br != null) {
                try { br.close(); } catch (IOException ignored) {}
            }
        }
    }
}
