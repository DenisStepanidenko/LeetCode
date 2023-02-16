package LeetCode.Medium.FourSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> answer = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && (nums[i] == nums[i - 1])) {
                continue;
            } else {
                threeSum(nums, target, nums[i], answer , i);
            }
        }
        return answer;
    }

    public static void threeSum(int[] nums, int target, int currentNumber, List<List<Integer>> answer, int index) {

        Arrays.sort(nums);
        for (int i = index+1; i < nums.length; i++) {
            if (i > (index+1) && nums[i] == nums[i - 1]) {
                continue;
            }
            int l = i + 1, r = nums.length - 1;
            while (l < r) {
                long threeSum = (long)nums[i] + (long)nums[l] + (long)nums[r];
                //System.out.println(nums[i] + " " +  nums[l]  + " " +  nums[r]);
                //System.out.println(threeSum);
                if (threeSum > (target - currentNumber)) {
                    r--;
                } else if (threeSum < (target - currentNumber)) {
                    l++;
                } else {

                    System.out.println(threeSum);
                    answer.add(new ArrayList<>(List.of(nums[i], nums[l], nums[r] , currentNumber)));
                    l++;
                    while (l < r && (nums[l] == nums[l - 1])) {
                        l++;
                    }
                }
            }

        }

    }

    public static void main(String[] args) {
        //int y = 1000000000;
        //System.out.println(y + " странно");
        int[] arr = {1000000000,1000000000,1000000000,1000000000};
        System.out.println(fourSum(arr , -294967296));
        //int x = -294967296;
        //System.out.println(x);
    }
}
