// CharStreamDemo.java
// Demonstrates character stream writing and reading (text files)
// Compile: javac CharStreamDemo.java
// Run:     java CharStreamDemo

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class CharStreamDemo {
    public static void main(String[] args) {
        String filename = "charstream_demo.txt";

        System.out.println("=== CharStream Demo ===");

        // Write text using BufferedWriter (character stream)
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
            bw.write("Line 1: Character stream demo.");
            bw.newLine();
            bw.write("Line 2: Using FileWriter + BufferedWriter.");
            System.out.println("Wrote to " + filename);
        } catch (IOException e) {
            System.out.println("Write error: " + e.getMessage());
        }

        // Read text back using BufferedReader (character stream)
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            System.out.println("Reading " + filename + "...");
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println("  " + line);
            }
        } catch (IOException e) {
            System.out.println("Read error: " + e.getMessage());
        }
    }
}
