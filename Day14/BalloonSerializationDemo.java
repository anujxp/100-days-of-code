// BalloonSerializationDemo.java
// Demonstrates serialization & transient keyword using a Balloon example
// Creates many Balloon objects, serializes them to a file (truck), then deserializes (inflate again)
// Compile: javac BalloonSerializationDemo.java
// Run:     java BalloonSerializationDemo

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Balloon implements Serializable {
    private static final long serialVersionUID = 1L;
    int id;
    String color;
    // whether balloon is inflated at runtime — we don't want to persist this
    transient boolean inflated;

    Balloon(int id, String color, boolean inflated) {
        this.id = id;
        this.color = color;
        this.inflated = inflated;
    }

    @Override
    public String toString() {
        return "Balloon{id=" + id + ", color=" + color + ", inflated=" + inflated + "}";
    }
}

public class BalloonSerializationDemo {
    public static void main(String[] args) {
        String file = "balloons.trk"; // truck file
        System.out.println("=== Balloon Serialization Demo ===");

        // create sample balloons (for demo, not 1000 for speed — but you can change COUNT)
        final int COUNT = 20; // change to 1000 to fully simulate
        List<Balloon> balloons = new ArrayList<>();
        for (int i = 1; i <= COUNT; i++) {
            Balloon b = new Balloon(i, pickColor(i), true); // inflated==true at runtime
            balloons.add(b);
        }

        System.out.println("Created " + balloons.size() + " balloons (inflated=true at runtime).");

        // Serialize: squeeze balloons and put into truck (write objects to file)
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(balloons);
            System.out.println("Serialized " + balloons.size() + " balloons into truck file: " + file);
        } catch (IOException e) {
            System.out.println("Serialization error: " + e.getMessage());
        }

        // Reset local state to mimic new program run (all runtime inflation state lost)
        balloons = null;

        // Deserialize: unload truck and inflate balloons (read objects back)
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            Object obj = ois.readObject();
            if (obj instanceof List) {
                @SuppressWarnings("unchecked")
                List<Balloon> loaded = (List<Balloon>) obj;
                System.out.println("Deserialized " + loaded.size() + " balloons from truck.");
                // Show that transient 'inflated' field is false (default) after deserialization
                int inflatedCount = 0;
                for (Balloon b : loaded) {
                    // inflated was transient — not persisted — so default value (false) after deserialization
                    if (b.inflated) inflatedCount++;
                }
                System.out.println("Number of balloons with inflated==true after deserialization: " + inflatedCount);
                System.out.println("You must inflate them again (set inflated=true) after reading.");
                // Simulate inflating them again
                for (Balloon b : loaded) {
                    b.inflated = true;
                }
                System.out.println("Inflated again. Example balloon: " + loaded.get(0));
            } else {
                System.out.println("Unexpected object in file.");
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Deserialization error: " + e.getMessage());
        }
    }

    private static String pickColor(int i) {
        String[] colors = { "Red", "Blue", "Green", "Yellow", "Pink", "Orange" };
        return colors[(i - 1) % colors.length];
    }
}
