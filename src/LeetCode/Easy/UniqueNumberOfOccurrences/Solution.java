package LeetCode.Easy.UniqueNumberOfOccurrences;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer , Integer> numbers = new HashMap<>();
        for(int x : arr){
            if(numbers.containsKey(x)){
                numbers.put(x , numbers.get(x) + 1);
            }
            else{
                numbers.put(x , 1);
            }
        }
        Set<Integer> test = new HashSet<>(numbers.values());
        return test.size() == numbers.values().size();
    }
}
