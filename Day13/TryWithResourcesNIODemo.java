// TryWithResourcesNIODemo.java
// Read a file using java.nio and try-with-resources with BufferedReader via Files.newBufferedReader

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TryWithResourcesNIODemo {
    public static void main(String[] args) {
        Path p = Path.of("niox_sample.txt");

        // create sample file if missing
        try {
            Files.writeString(p, "NIOX Sample Line 1\nNIOX Sample Line 2\n");
            System.out.println("Wrote sample file: " + p);
        } catch (IOException e) {
            System.out.println("Could not write sample file: " + e.getMessage());
        }

        // read file with try-with-resources using NIO
        System.out.println("Reading with NIO:");
        try (BufferedReader br = Files.newBufferedReader(p)) {
            String l;
            while ((l = br.readLine()) != null) {
                System.out.println("  " + l);
            }
        } catch (IOException e) {
            System.out.println("NIO Read error: " + e.getMessage());
        }
    }
}

