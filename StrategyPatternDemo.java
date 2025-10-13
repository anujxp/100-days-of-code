/*
StrategyPatternDemo.java
Simple Strategy pattern: SortingStrategy interface and two implementations.
Demonstrates selecting algorithm at runtime (polymorphism via interface).
Compile:
  javac StrategyPatternDemo.java
Run:
  java StrategyPatternDemo
*/

import java.util.Arrays;

interface SortingStrategy {
    int[] sort(int[] arr);
    String name();
}

class BubbleSortStrategy implements SortingStrategy {
    public int[] sort(int[] arr) {
        int[] a = Arrays.copyOf(arr, arr.length);
        int n = a.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-1-i; j++) {
                if (a[j] > a[j+1]) {
                    int t = a[j]; a[j] = a[j+1]; a[j+1] = t;
                }
            }
        }
        return a;
    }
    public String name() { return "BubbleSort"; }
}

class JavaSortStrategy implements SortingStrategy {
    public int[] sort(int[] arr) {
        int[] a = Arrays.copyOf(arr, arr.length);
        Arrays.sort(a);
        return a;
    }
    public String name() { return "JavaArrays.sort"; }
}


class StrategyPatternDemo {
    public static void main(String[] args) {
        System.out.println("=== Strategy Pattern Demo ===");
        int[] input = {5, 2, 9, 1, 5, 6};

        SortingStrategy s1 = new BubbleSortStrategy();
        SortingStrategy s2 = new JavaSortStrategy();

        System.out.println("Input: " + Arrays.toString(input));
        System.out.println("-- Using " + s1.name() + " --");
        System.out.println(Arrays.toString(s1.sort(input)));

        System.out.println("-- Using " + s2.name() + " --");
        System.out.println(Arrays.toString(s2.sort(input)));
    }
}
