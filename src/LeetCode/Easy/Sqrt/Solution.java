package LeetCode.Easy.Sqrt;

public class Solution {
    public static int mySqrt(int x) {
        if (x <= 1) {
            return x;
        }
        int start = 1;
        int end = x / 2;

        while (start < end) {
            int mid = (start + (end - start) / 2) + 1;

            int div = x / mid;
            if(div > mid){
                start = mid;
            }
            else if(div == mid){
                return div;
            }
            else{
                end = mid - 1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        System.out.println(11 / 2);
    }
}
