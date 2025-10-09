

import java.util.Arrays;

public class SortingBasedExamples {
    // Find two numbers whose sum is closest to a target (returns pair)
    public static int[] closestPair(int[] nums, int target) {
        int[] arr = Arrays.copyOf(nums, nums.length);
        Arrays.sort(arr);
        int l = 0, r = arr.length - 1;
        int bestDiff = Integer.MAX_VALUE;
        int[] best = new int[]{-1, -1};
        while (l < r) {
            int s = arr[l] + arr[r];
            int diff = Math.abs(s - target);
            if (diff < bestDiff) {
                bestDiff = diff;
                best[0] = arr[l];
                best[1] = arr[r];
            }
            if (s < target) l++;
            else r--;
        }
        return best;
    }

    public static void main(String[] args) {
        System.out.println("--- Sorting Based Examples ---");
        int[] nums = { -8,4,5,1,3,9 };
        int target = 7;
        System.out.println("Original: " + Arrays.toString(nums));
        int[] pair = closestPair(nums, target);
        System.out.println("Closest pair to " + target + " -> " + Arrays.toString(pair));
    }
}
