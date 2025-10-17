import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWriteDemo {
    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        System.out.println("=== File Read/Write Demo ===");
        // write sample content
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {
            bw.write("Line 1: Hello from Day13!");
            bw.newLine();
            bw.write("Line 2: File I/O using BufferedWriter.");
            System.out.println("Wrote sample content to " + outputFile);
        } catch (IOException e) {
            System.out.println("Write error: " + e.getMessage());
        }

        // read back content
        try (BufferedReader br = new BufferedReader(new FileReader(outputFile))) {
            System.out.println("Reading " + outputFile + "...");
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println("  " + line);
            }
        } catch (IOException e) {
            System.out.println("Read error: " + e.getMessage());
        }
    }
}
