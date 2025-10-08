// Day 5 — Arrays in Java 📦
// Introduction to Arrays in Java

public class ArrayIntroduction {
    public static void main(String[] args) {
        int[] scores = {95, 89, 76, 88}; // Array declaration and initialization

        System.out.println("Student Scores:");
        for (int i = 0; i < scores.length; i++) {
            System.out.println("scores[" + i + "] = " + scores[i]);
        }
    }
}