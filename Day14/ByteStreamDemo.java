// ByteStreamDemo.java
// Demonstrates byte stream writing and reading (binary view)
// Compile: javac ByteStreamDemo.java
// Run:     java ByteStreamDemo

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


class ByteStreamDemo {
    public static void main(String[] args) {
        String file = "bytestream_demo.bin";
        System.out.println("=== ByteStream Demo ===");

        // Write bytes (a short text as bytes)
        byte[] data = "Hello as bytes!".getBytes();
        try (FileOutputStream fos = new FileOutputStream(file)) {
            fos.write(data);
            System.out.println("Wrote bytes to " + file + " (" + data.length + " bytes)");
        } catch (IOException e) {
            System.out.println("Write error: " + e.getMessage());
        }

        // Read bytes back
        try (FileInputStream fis = new FileInputStream(file)) {
            System.out.print("Read bytes: ");
            int b;
            while ((b = fis.read()) != -1) {
                System.out.print((char) b);
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println("Read error: " + e.getMessage());
        }
    }
}
