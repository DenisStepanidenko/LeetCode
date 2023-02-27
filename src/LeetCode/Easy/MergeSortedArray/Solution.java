package LeetCode.Easy.MergeSortedArray;

import java.util.Arrays;

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums3 = new int[m + n];
        int i = 0 , j = 0 , k = 0;
        while(i!= m && j!=n){
            if(nums1[i] < nums2[j]){
                nums3[k] = nums1[i];
                k++;
                i++;
            }
            else{
                nums3[k] = nums2[j];
                j++;
                k++;
            }
        }
        if(i == m){
            for(; k < m+n ; j++ , k++){
                nums3[k] = nums2[j];
            }
        }
        else {
          for( ; k < m+ n ; k++ , i++){
              nums3[k] = nums1[i];
          }
        }
        i = 0;
        for(; i < m+n ; i++){
            nums1[i] = nums3[i];
        }
    }
}
