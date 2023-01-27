package LeetCode.Easy.PascalTrianglePart2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            answer.add(combinations(rowIndex ,i).intValue());
        }
        return answer;
    }

    public BigInteger combinations(int n, int k) {
        return factorial(n).divide(factorial(n - k).multiply(factorial(k)));
    }

    public BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++)
            result = result.multiply(BigInteger.valueOf(i));
        return result;
    }
}
