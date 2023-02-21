package LeetCode.Easy.MergeTwoSortedLists;

public class ListNode {

    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }
    public void add(int val){
        while(next!=null){
            next = next.next;
        }
        next = new ListNode(val);
    }


    public void info(){
        while(next != null){
            System.out.println(next.val);
            next = next.next;
        }
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
