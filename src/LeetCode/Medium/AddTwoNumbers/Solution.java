package LeetCode.Medium.AddTwoNumbers;

import java.util.List;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp = new ListNode(0);
        ListNode current = temp;
        int remains = 0;
        int numberFirst, numberSecond;
        while (l1 != null || l2 != null || remains == 1) {
            if (l1 != null) {
                numberFirst = l1.val;
            } else {
                numberFirst = 0;
            }
            if (l2 != null) {
                numberSecond = l2.val;
            } else {
                numberSecond = 0;
            }

            int currentNumber = numberFirst + numberSecond;
            remains = currentNumber / 10;
            temp.next = new ListNode(currentNumber % 10);

            if(l1 != null){
                l1 = l1.next;
            }
            if(l2 != null){
                l2 = l2.next;
            }
            temp = temp.next;
        }

        return temp.next;
    }
}
