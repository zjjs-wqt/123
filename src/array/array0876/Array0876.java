package array.array0876;

public class Array0876 {
}
//Definition for singly-linked list.
  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode p = head , q = head ;
        while( q != null && q.next != null ){
            q= q.next.next;
            p=p.next;
        }
        return p ;
    }
}