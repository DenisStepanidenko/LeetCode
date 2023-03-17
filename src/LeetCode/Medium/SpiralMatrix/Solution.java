package LeetCode.Medium.SpiralMatrix;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> answer = new ArrayList<>();
        int left = 0, right = matrix[0].length;
        int top = 0, bottom = matrix.length;


        while (left < right && top < bottom) {
            // пройдёмся по строки вправо
            for (int i = left; i < right; i++) {
                answer.add(matrix[top][i]);
            }
            top++;

            // пройдёмся по строке вниз
            for (int i = top; i < bottom; i++) {
                answer.add(matrix[i][right - 1]);
            }
            right--;

            if (!(left < right && top < bottom)) {
                break;
            }
            // двигаемся справа налево по строке
            for (int i = right - 1; i >= left; i--) {
                answer.add(matrix[bottom -1][i]);
            }
            bottom--;

            // двигаемся снизу вверху по столбцу

            for(int i = bottom -1 ; i >= top ; i--){
                answer.add(matrix[i][left]);
            }
            left++;
        }

        return answer;
    }
}
