package LeetCode.Easy.RemoveDuplicatesFromSortedArray;

import java.util.Arrays;

public class Solution {
    public static int removeDuplicates(int[] nums) {

        int target = nums[0];
        int count = 1;
        for (int i = 0, j = 1; j < nums.length; j++) {
            if (nums[j] == target) {
                if(j == nums.length-1){
                    nums[i] = target;
                }
                continue;
            } else {
                count++;
                int temp = nums[i];
                nums[i] = nums[j - 1];
                nums[j - 1] = target;
                i++;
                target = nums[j];
                if(j == nums.length-1){
                    nums[i] = target;

                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }
}
