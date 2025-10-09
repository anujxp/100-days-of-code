package Day06_Arrays_Algorithms;

// LeetCode 88 — Merge Sorted Array
// Technique: Two pointers from end (in-place)

import java.util.Arrays;

public class LC_088_MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1, j = n - 1, k = m + n - 1;
        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) nums1[k--] = nums1[i--];
            else nums1[k--] = nums2[j--];
        }
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,0,0,0};
        int[] b = {2,5,6};
        merge(a,3,b,3);
        System.out.println(Arrays.toString(a)); // [1,2,2,3,5,6]
    }
}
