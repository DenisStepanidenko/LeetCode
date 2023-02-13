package LeetCode.Medium.Permutations;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class Solution {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        return myOwnPermute(nums, nums.length , answer);
    }

    public static List<List<Integer>> myOwnPermute(int[] nums, int n , List<List<Integer>> answer) {
        if (n == 1) {
            List<Integer> current = Arrays.stream(nums).boxed().toList();
            answer.add(current);
        } else {
            for (int i = 0; i < n ; i++) {
                myOwnPermute(nums, n - 1 , answer);
                if (n % 2 == 0) {
                    swap(nums, i, n - 1);
                } else {
                    swap(nums, 0, n - 1);
                }
            }
        }
        return answer;
    }

    public static void swap(int[] arr, int i, int i1) {
        int tmp = arr[i];
        arr[i] = arr[i1];
        arr[i1] = tmp;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(permute(arr));
    }

}
