// AppendAndRotateDemo.java
// Demonstrates appending to a file and a simple log rotation approach (rename then recreate)

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class AppendAndRotateDemo {
    public static void main(String[] args) {
        String logFile = "app.log";

        // append new log lines
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(logFile, true))) {
            bw.write("INFO: Application started");
            bw.newLine();
            bw.write("INFO: Another log entry");
            bw.newLine();
            System.out.println("Appended log lines to " + logFile);
        } catch (IOException e) {
            System.out.println("Append error: " + e.getMessage());
        }

        // simple rotation: if file larger than threshold (bytes), rename
        try {
            Path p = Path.of(logFile);
            long size = Files.size(p);
            long threshold = 1024 * 2; // 2 KB for demo
            System.out.println("Log size: " + size + " bytes");
            if (size > threshold) {
                String rotated = "app.log.1";
                Files.move(p, Path.of(rotated));
                System.out.println("Rotated log to " + rotated);
                // recreate empty log
                Files.createFile(p);
                System.out.println("Created new log file: " + logFile);
            } else {
                System.out.println("Rotation not needed.");
            }
        } catch (IOException e) {
            System.out.println("Rotation error: " + e.getMessage());
        }
    }
}
