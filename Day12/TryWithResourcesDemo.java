// TryWithResourcesDemo.java
// Demonstrates try-with-resources for automatic resource cleanup (Java 7+)
// Compile: javac TryWithResourcesDemo.java
// Run:     java TryWithResourcesDemo

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class TryWithResourcesDemo {
    public static void main(String[] args) {
        System.out.println("=== Try-With-Resources Demo ===");
        // This will automatically close the BufferedReader
        try (BufferedReader br = new BufferedReader(new FileReader("nonexistent-file.txt"))) {
            String line = br.readLine();
            System.out.println(line);
        } catch (IOException e) {
            System.out.println("I/O error handled: " + e.getMessage());
        }
    }
}
