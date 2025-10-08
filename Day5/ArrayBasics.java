// ArraysBasics.java
// Simple declaration, creation and basic usage

public class ArraysBasics {
    public static void main(String[] args) {
        // declaration + creation
        int[] scores = new int[4]; // 4 slots: indices 0..3

        // initialization
        scores[0] = 95;
        scores[1] = 89;
        scores[2] = 76;
        scores[3] = 88;

        // length
        System.out.println("Array length: " + scores.length);

        // access by index
        System.out.println("scores[0] = " + scores[0]);
        System.out.println("scores[3] = " + scores[3]);
    }
}
