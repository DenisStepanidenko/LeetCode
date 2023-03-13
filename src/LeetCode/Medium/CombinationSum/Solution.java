package LeetCode.Medium.CombinationSum;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> current = new ArrayList<>();

        dfs( 0 ,current , 0 , target , candidates , answer);
        return answer;
    }

    public static void main(String[] args) {

    }

    public void dfs(int i, List<Integer> current, int total, int target, int[] canditates, List<List<Integer>> answer) {
        if (total == target) {
            answer.add(List.copyOf(current));
            return;
        }
        if (i >= canditates.length || total > target) {
            return;
        }

        current.add(canditates[i]);
        dfs(i, current, total + canditates[i], target, canditates, answer);

        current.remove(current.size() - 1);

        dfs(i + 1, current, total, target, canditates, answer);

    }
}
