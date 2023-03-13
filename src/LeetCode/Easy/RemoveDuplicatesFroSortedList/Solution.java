package LeetCode.Easy.RemoveDuplicatesFroSortedList;

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        while(temp.next != null){
            if(temp.val == temp.next.val){
                temp.next = temp.next.next;
            }
            temp = temp.next;
        }
        return head;
    }

    public static void main(String[] args) {
        
    }
}
