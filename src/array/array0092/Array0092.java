package array.array0092;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

public class Array0092 {
}
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode ANS = new ListNode(0);
        ANS.next = head;
        ListNode pre = ANS;
        for(int i = 1 ; i < left ; i++ ){
            pre = pre.next;
        }
        head = pre.next;
        for(int i = left ; i < right ; i++ ){
            ListNode nex = head.next;
            head.next=nex.next;
            nex.next= pre.next;
            pre.next=nex;
        }
        return ANS.next;
    }
}