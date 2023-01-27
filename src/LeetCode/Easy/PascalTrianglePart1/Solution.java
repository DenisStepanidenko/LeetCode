package LeetCode.Easy.PascalTrianglePart1;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> answer = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            if (i == 0) {
                List<Integer> current = new ArrayList<>(List.of(1));
                answer.add(current);
            } else if (i == 1) {
                List<Integer> current = new ArrayList<>(List.of(1, 1));
                answer.add(current);
            } else {
                List<Integer> current = new ArrayList<>();
                current.add(1);
                for (int k = 0; k < i - 1; k++) {
                    current.add(answer.get(i-1).get(k) + answer.get(i-1).get(k+1));
                }
                current.add(1);
                answer.add(current);
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(generate(25));
    }
}
