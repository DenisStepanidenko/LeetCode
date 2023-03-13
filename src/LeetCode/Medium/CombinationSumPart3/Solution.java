package LeetCode.Medium.CombinationSumPart3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        int[] nums = new int[9];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i + 1;
        }
        dfs(0 , current , 0 , n , nums ,  answer , k );



        return answer;
    }


    public void dfs(int i, List<Integer> current, int total, int target, int[] canditates, List<List<Integer>> answer , int count) {
        if (total == target && count == 0) {
            answer.add(List.copyOf(current));
            return;
        }
        if (total > target) {

            return;
        }

        for (; i < canditates.length; i++) {

            current.add(canditates[i]);

            dfs(i + 1, current, total + canditates[i], target, canditates, answer, count - 1);
            current.remove(current.size() - 1);

        }


    }

    public static void main(String[] args) {

    }


}
