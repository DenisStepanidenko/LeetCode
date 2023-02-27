package LeetCode.Easy.LinkedListCycle;

public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode low , fast ;
        low = head;
        fast = head;
        while(fast!=null && fast.next!=null){
            low = low.next;
            fast = fast.next.next;
            if(fast == null){
                return false;
            }
            if(low.equals(fast)){
                return true;
            }

        }
        return false;
    }
}
