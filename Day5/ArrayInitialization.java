// ArrayInitialization.java
// Different ways to initialize arrays

public class ArrayInitialization {
    public static void main(String[] args) {
        // 1. Explicit new with size and assignments
        int[] a = new int[3];
        a[0] = 10; a[1] = 20; a[2] = 30;

        // 2. Inline immediately with literals
        int[] b = {1, 2, 3, 4};

        // 3. Using array initializer (must be at declaration)
        String[] colors = new String[] {"Red", "Green", "Blue"};

        // print
        System.out.println("a length: " + a.length);
        System.out.println("b[2]: " + b[2]);
        System.out.println("colors[1]: " + colors[1]);
    }
}
