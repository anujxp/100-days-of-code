// TryWithResourcesNIO.java
// Demonstrates java.nio Path/Files with try-with-resources
// Compile: javac TryWithResourcesNIO.java
// Run:     java TryWithResourcesNIO

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

class TryWithResourcesNIO {
    public static void main(String[] args) {
        Path p = Path.of("nio_demo.txt");
        System.out.println("=== NIO Try-With-Resources Demo ===");

        // Write using Files.newBufferedWriter
        try (BufferedWriter bw = Files.newBufferedWriter(p)) {
            bw.write("NIO demo line 1");
            bw.newLine();
            bw.write("NIO demo line 2");
            System.out.println("Wrote sample to " + p);
        } catch (IOException e) {
            System.out.println("NIO write error: " + e.getMessage());
        }

        // Read using Files.newBufferedReader
        try (BufferedReader br = Files.newBufferedReader(p)) {
            System.out.println("Reading " + p + "...");
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println("  " + line);
            }
        } catch (IOException e) {
            System.out.println("NIO read error: " + e.getMessage());
        }
    }
}
