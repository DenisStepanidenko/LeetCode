package LeetCode.Medium.FindFirstAndLastPositionOfElementInSortedArray;

import java.util.Arrays;

public class Solution {
    public static int[] searchRange(int[] nums, int target) {
        int[] answer = new int[2];
        int firstIndex = firstIndex(nums, target);
        if (firstIndex == nums.length || nums[firstIndex] != target) {
            return new int[]{-1, -1};
        } else {
            answer[0] = firstIndex;
            answer[1] = lastIndex(nums, target);
        }
        return answer;


    }

    public static void main(String[] args) {
        int k = 1 ^ 3;
        System.out.println(k);
    }

    public static int firstIndex(int[] nums, int target) {

        int l = -1, r = nums.length;
        while (l + 1 < r) {
            int middle = (r + l) / 2;

            if (nums[middle] >= target) {
                r = middle;

            } else if (nums[middle] < target) {
                l = middle;

            }

        }
        return r;
    }

    public static int lastIndex(int[] nums, int target) {

        int l = -1, r = nums.length;
        while (l + 1 < r) {
            int middle = (r + l) / 2;

            if (nums[middle] > target) {
                r = middle;
            } else if (nums[middle] <= target) {
                l = middle;

            }

        }
        return l;
    }

}