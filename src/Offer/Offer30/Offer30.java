package Offer.Offer30;

import java.util.Stack;

public class Offer30 {
}
class MinStack {
    Stack<Integer> stack1 ;
    int minx ;
    /** initialize your data structure here. */
    public MinStack() {
        stack1 = new Stack<>();
    }

    public void push(int x) {
        if(stack1.empty())
            minx=x;
        if(x <= minx ) {
            stack1.push(minx);
            minx = x ;
        }
        stack1.push(x);

    }

    public void pop() {
        if(stack1.pop()==minx){
            minx=stack1.pop();
        }
    }

    public int top() {
        return stack1.peek();
    }

    public int min() {
        return minx;
    }
}