package LeetCode.Easy.FibonacciNumber;

public class Solution {
    public int fib(int n) {
        if(n <= 1){
            return n;
        }
        else{
            int[] nums = new int[n+1];
            nums[0] = 0;
            nums[1] = 1;

            for(int i = 2 ; i < n+1; i++){
                nums[i] = nums[i-1] + nums[i-2];
            }
            return nums[n];
        }
    }
}
