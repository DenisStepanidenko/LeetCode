package LeetCode.Easy.TwoSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        Map<Integer, Integer> numbers = new HashMap<>(); // будем хранить мапу из индеса массива - число
        for (int i = 0; i < nums.length; i++) {
            numbers.put(i, nums[i]);
        }
        // Заполнили мапу
        for (Map.Entry<Integer, Integer> entry : numbers.entrySet()) {
            int x = target - entry.getValue();
            if (numbers.containsValue(x)) {
                int key = 0;
                for (Map.Entry<Integer, Integer> entryNew : numbers.entrySet()) {
                    if (entryNew.getValue() == x) {
                        key = entryNew.getKey();
                    }
                }
                if(key == entry.getKey()){
                    continue;
                }
                else {
                    answer[0] = entry.getKey();
                    answer[1] = key;
                    break;
                }

            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3,3};
        System.out.println(Arrays.toString(twoSum(nums, 6)));
    }
}
