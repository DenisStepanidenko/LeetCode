package LeetCode.Easy.MergeTwoSortedLists;

public class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode answer = new ListNode(0);
        ListNode current = answer;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }
        if (list1 != null) {
            current.next = list1;
        }
        if (list2 != null) {
            current.next = list2;
        }

        return answer.next;
    }

    public static void main(String[] args) {
        ListNode test = new ListNode();
        test.add(5);
        test.add(7);
        test.add(10);
        test.info();
    }
}
