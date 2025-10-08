// Program to find the average of elements in an array

public class ArrayAverage {
    public static void main(String[] args) {
        int[] marks = {80, 90, 75, 85, 100};
        int sum = 0;

        for (int mark : marks) {
            sum += mark;
        }

        double average = (double) sum / marks.length;
        System.out.println("Average marks: " + average);
    }
}