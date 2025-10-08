// ArrayOperations.java
// Sum, max, min, reverse (simple implementations)

public class ArrayOperations {
    public static int sum(int[] arr) {
        int s = 0;
        for (int v : arr) s += v;
        return s;
    }

    public static int max(int[] arr) {
        if (arr.length == 0) throw new IllegalArgumentException("Empty array");
        int m = arr[0];
        for (int v : arr) if (v > m) m = v;
        return m;
    }

    public static void reverse(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
            i++; j--;
        }
    }

    public static void main(String[] args) {
        int[] data = {3, 7, 2, 9, 4};
        System.out.println("Sum: " + sum(data));
        System.out.println("Max: " + max(data));
        System.out.print("Original: ");
        for (int v : data) System.out.print(v + " ");
        reverse(data);
        System.out.print("\nReversed: ");
        for (int v : data) System.out.print(v + " ");
    }
}
