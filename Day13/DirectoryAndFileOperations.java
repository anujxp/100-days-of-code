// DirectoryAndFileOperations.java
// Create directory, list files, delete file example using java.nio

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class DirectoryAndFileOperations {
    public static void main(String[] args) {
        Path folder = Path.of("day13_data");
        try {
            if (!Files.exists(folder)) {
                Files.createDirectory(folder);
                System.out.println("Created folder: " + folder);
            } else {
                System.out.println("Folder already exists: " + folder);
            }

            // create sample files
            Files.writeString(folder.resolve("a.txt"), "A");
            Files.writeString(folder.resolve("b.txt"), "B");

            // list files
            System.out.println("Listing files in " + folder);
            try (DirectoryStream<Path> stream = Files.newDirectoryStream(folder)) {
                for (Path p : stream) {
                    System.out.println("  " + p.getFileName() + "  (size=" + Files.size(p) + ")");
                }
            }

            // delete one file
            Path toDelete = folder.resolve("a.txt");
            Files.deleteIfExists(toDelete);
            System.out.println("Deleted file: " + toDelete.getFileName());
        } catch (IOException e) {
            System.out.println("IO error: " + e.getMessage());
        }
    }
