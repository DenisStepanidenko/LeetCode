package LeetCode.Easy.NumberOfDistinctAverages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        List<Double> numbers = new ArrayList<>();
        int answer = 0;
        int i = 0 , j = nums.length - 1;
        while( i < j){
            double x = (nums[i] + nums[j]);
            if(!numbers.contains(x)){
                numbers.add(x);
                answer++;
            }
            if(nums[i] == nums[j]){
                i++;
            }
            i++;
            j--;
        }
        return answer;
    }
}
