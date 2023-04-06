package LeetCode.Medium.Permutations;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class Solution {
    /*
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        return myOwnPermute(nums, nums.length , answer);
    }

     */

    public static void HipAlgorithm(int[] nums, int k) {
        if (k == 1) {
            System.out.println(Arrays.toString(nums));
        } else {
            for (int i = 0; i < k; i++) {
                HipAlgorithm(nums, k - 1);
                if (k % 2 == 0) {
                    swap(nums, i, k - 1);
                } else {
                    swap(nums, 0, k - 1);
                }
            }
        }

    }

    public static void swap(int[] arr, int i, int i1) {
        int tmp = arr[i];
        arr[i] = arr[i1];
        arr[i1] = tmp;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,6,9,10,11,12,13,14,15,16};
        long start = System.currentTimeMillis();
        HipAlgorithm(arr, arr.length);
        long end = System.currentTimeMillis();
        System.out.println((end - start)/1000.);
    }

}
