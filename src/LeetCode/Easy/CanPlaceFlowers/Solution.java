package LeetCode.Easy.CanPlaceFlowers;

public class Solution {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int m = n;
        if(n == 0){
            return true;
        }
        if(flowerbed.length == 1){
            return (flowerbed[0] == 0 && n == 1);
        }
        for (int i = 0; i < flowerbed.length - 1; i++) {
            if (i == 0) {
                if (flowerbed[i + 1] == 0 && flowerbed[i] != 1) {
                    flowerbed[i] = 1;
                    m--;
                    if (m == 0) {
                        return true;
                    }
                }
            } else {
                if (flowerbed[i] == 1) {
                    continue;
                } else if (flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {

                    flowerbed[i] = 1;
                    m--;
                    if (m == 0) {
                        return true;
                    }
                }
            }
        }
        if (flowerbed.length > 1) {
            if (flowerbed[flowerbed.length - 1] == 0 && flowerbed[flowerbed.length - 2] == 0) {
                m--;
                if (m == 0) {
                    return true;

                }
            }
        }
        return m == 0;
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 0, 1, 0, 0};
        System.out.println(canPlaceFlowers(arr, 2));
    }
}
