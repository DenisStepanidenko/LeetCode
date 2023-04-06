package LeetCode.Medium.SubsetsPart2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> currentSubset = new ArrayList<>();

        dfs(0, nums, currentSubset, answer);

        return answer;
    }

    public void dfs(int i, int[] nums, List<Integer> currentSubset, List<List<Integer>> answer) {
        if (i >= nums.length) {
            answer.add(List.copyOf(currentSubset));
            return;
        }
        currentSubset.add(nums[i]);
        dfs(i + 1, nums, currentSubset, answer);
        currentSubset.remove(currentSubset.size() - 1);
        while (i < nums.length - 1 && nums[i] == nums[i+1]) {
            i++;
        }

        dfs(i+1 , nums , currentSubset , answer);
    }
}
