package LeetCode.Easy.RemoveElement;

public class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0, j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                count++;
                if (i < j) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
                i++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println();
    }
}
