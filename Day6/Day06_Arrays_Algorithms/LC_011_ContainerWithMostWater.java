package Day06_Arrays_Algorithms;

// LeetCode 11 — Container With Most Water
// Technique: Two pointers from ends, move smaller pointer inward.

public class LC_011_ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int l = 0, r = height.length - 1;
        int max = 0;
        while (l < r) {
            int h = Math.min(height[l], height[r]);
            max = Math.max(max, h * (r - l));
            if (height[l] < height[r]) l++;
            else r--;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] h = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(h)); // 49
    }
}