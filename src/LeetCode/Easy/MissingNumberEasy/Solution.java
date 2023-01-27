package LeetCode.Easy.MissingNumberEasy;

import java.util.Arrays;

public class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int assumedSum = ((n + 1) * n) / 2;
        int currentSum = Arrays.stream(nums).sum();
        return assumedSum-currentSum;
    }
}
