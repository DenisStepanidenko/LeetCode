package LeetCode.Medium.SubsetsPart1;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> currentSubset = new ArrayList<>();

        dfs(0, answer, currentSubset, nums);

        return answer;
    }

    public static void dfs(int i, List<List<Integer>> answer, List<Integer> currentSubset, int[] nums) {
        if (i >= nums.length) {
            answer.add(List.copyOf(currentSubset));
            return;
        }

        currentSubset.add(nums[i]);
        dfs(i + 1, answer, currentSubset, nums);
        //System.out.println("Проверка " + currentSubset + " индекс + " + i);
        currentSubset.remove(currentSubset.size() - 1);
        //System.out.println("Проверка " + currentSubset + " индекс + " + i);
        dfs(i + 1, answer, currentSubset, nums);


    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(subsets(nums));
    }
}
