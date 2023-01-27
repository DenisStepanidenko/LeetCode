package LeetCode.Easy.DivideArrayIntoEqualPairs;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean divideArray(int[] nums) {
        Map<Integer, Integer> numbers = new HashMap<>();
        for (int x : nums) {
            if (numbers.containsKey(x)) {
                numbers.put(x, numbers.get(x) + 1);
            } else {
                numbers.put(x, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : numbers.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = new int[501];
        System.out.println(Arrays.toString(arr));
    }
}
