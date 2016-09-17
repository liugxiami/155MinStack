package com.ccsi;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    //Design a stack that supports push,pop,top,and retrieving the minimum element in constant time
    //push(x)--push element x onto stack
    //pop()--removes the element on top of the stack
    //top()--get the top element
    //getMin()--retrieve the minimum element in the stack

}
class MinStack{                                 //用stack来实现minStack，没测试可行性。
    private Stack<Integer> data=new Stack<>();
    private Stack<Integer> mins=new Stack<>();

    public void push(int x){
        data.push(x);
        if(mins.isEmpty()||mins.peek()>=x){
            mins.push(x);
        }
    }

    public void pop(){
        if(!data.isEmpty()){
            if(data.peek()==mins.peek()){
                mins.pop();
            }
            data.pop();
        }
    }

    public int top() {
        if(!data.isEmpty()){
            return data.peek();
        }else return -1;
    }

    public int getMin(){
       if(!mins.isEmpty()){
           return mins.peek();
       }else return Integer.MIN_VALUE;
    }
}
