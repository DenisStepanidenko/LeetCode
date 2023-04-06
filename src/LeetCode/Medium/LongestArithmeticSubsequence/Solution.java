package LeetCode.Medium.LongestArithmeticSubsequence;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int longestArithSeqLength(int[] nums) {
        Map<Integer, Map<Integer, Integer>> dp = new HashMap<>(); // будем хранить (разницу , (индекс с которого начинается посл. , длина)
        int answer = 2;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int diff = nums[j] - nums[i];
                Map<Integer , Integer> current = new HashMap<>();
                if(dp.containsKey(diff)){
                    current = dp.get(diff);
                    if(current.containsKey(i)){
                        current.put(j , current.get(i) + 1);
                        dp.put(diff, current);
                    }
                    else{
                        current.put(j , 2);
                        dp.put(diff , current);
                    }
                }
                else{
                    current.put(j , 2);
                    dp.put(diff , current);
                }

                answer = Math.max(answer , current.get(j));
            }
        }
        return answer;
    }
}
