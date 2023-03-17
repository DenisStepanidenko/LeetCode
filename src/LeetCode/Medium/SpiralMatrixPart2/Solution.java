package LeetCode.Medium.SpiralMatrixPart2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static int[][] generateMatrix(int n) {
        int[][] answer = new int[n][n];
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer[0].length; j++) {
                answer[j][i] = 0;
            }
        }
        spiralOrder(answer);


        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(generateMatrix(3)));
    }

    public static void spiralOrder(int[][] matrix) {

        int left = 0, right = matrix[0].length;
        int top = 0, bottom = matrix.length;
        int n = 1;

        while (left < right && top < bottom) {
            // пройдёмся по строки вправо
            for (int i = left; i < right; i++) {
                matrix[top][i] = n;
                System.out.println(n);
                n++;
            }
            top++;

            // пройдёмся по строке вниз
            for (int i = top; i < bottom; i++) {
                matrix[i][right - 1] = n;
                System.out.println(n);
                n++;
            }
            right--;

            if (!(left < right && top < bottom)) {
                break;
            }
            // двигаемся справа налево по строке
            for (int i = right - 1; i >= left; i--) {
                matrix[bottom - 1][i] = n;
                System.out.println(n);
                n++;
            }
            bottom--;

            // двигаемся снизу вверху по столбцу

            for (int i = bottom - 1; i > top; i--) {
                matrix[left][i] = n;
                System.out.println(n);
                n++;
            }
            left++;
        }
    }
}
