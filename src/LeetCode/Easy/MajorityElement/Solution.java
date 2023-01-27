package LeetCode.Easy.MajorityElement;

public class Solution {
    public int majorityElement(int[] nums) {
        int counter = 0;
        int answer = 0;
        for (int num : nums) {
            if (counter == 0) {
                answer = num;
                counter = 1;
            } else if (num == answer) {
                counter++;
            } else {
                counter--;
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        System.out.println(Math.ceil(1.5));
    }
}
