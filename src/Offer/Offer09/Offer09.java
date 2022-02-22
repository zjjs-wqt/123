package Offer.Offer09;

import java.util.Stack;

public class Offer09 {

}
class CQueue {
    Stack<Integer> stack1 ;
    Stack<Integer> stack2 ;
    public CQueue() {
        stack1 = new Stack<Integer>();
        stack2 = new Stack<Integer>();
    }

    public void appendTail(int value) {
        stack1.push(value);
    }

    public int deleteHead() {
        if(stack2.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        if(stack2.isEmpty())return -1;
        else return (int)stack2.pop();
    }
}