package LeetCode.Medium.TriplesOfSum;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length; i++){
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            int l = i + 1 , r = nums.length - 1;
            while( l < r){
                int threeSum = nums[i] + nums[l] + nums[r];
                if(threeSum > 0){
                    r--;
                }
                else if(threeSum < 0){
                    l++;
                }
                else{
                    answer.add(new ArrayList<>(List.of(nums[i] , nums[l] , nums[r])));
                    l++;
                    while(l < r && (nums[l] == nums[l-1]) ){
                        l++;
                    }
                }
            }
            System.out.println("hhelo");
        }
        return answer;
    }
}
