package LeetCode.Easy.SearchInsertPosition;

public class Solution {
    public int searchInsert(int[] nums, int target) {
        return runBinarySearchRecursively(nums, target, 0, nums.length - 1);
    }

    private int runBinarySearchRecursively(int[] nums, int target, int low, int high) {
        int mid = low + ((high - low) / 2);

        if (high < low) {
            return high + 1;
        }
        if (target == nums[mid]) {
            return mid;

        }
        if (target < nums[mid]) {
            return  runBinarySearchRecursively(nums, target, low, high - 1);
        } else {
            return  runBinarySearchRecursively(nums, target, mid + 1, high);
        }

    }

}
