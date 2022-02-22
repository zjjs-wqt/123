package Offer.Offer24;

import java.util.ArrayList;
import java.util.Stack;

public class Offer24 {
}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null){
            return null;
        }
        Stack<ListNode> stack = new Stack<>();
        while(head!=null){
            stack.push(head);
            head=head.next;
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        ListNode node = stack.pop();
        ListNode p = node;
        node.next=null;
        while (!stack.isEmpty()){
            node.next=stack.pop();
            node=node.next;
            node.next=null;
        }
        return p;
    }
}