package array.array0206;

import java.util.Stack;

public class Array0206 {
}
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode reverseList(ListNode head) {
        Stack<ListNode> stack = new Stack<ListNode>();
        ListNode tmp = new ListNode(0);
        ListNode tp = tmp ;
        while (head != null ){
            stack.push(head);
            head = head.next;
        }
        while(!stack.isEmpty()){
            tp.next=stack.pop();
            tp = tp.next;
        }
        tp.next=null;
        return tmp.next;
    }
}