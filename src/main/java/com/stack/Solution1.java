package com.stack;

import java.util.Stack;

public class Solution1 {

    Node first;

    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        solution.runReverseStack();
    }

    private void runReverseStack(){

        Stack<Integer> stack =createStack();
        printStack(stack);

        stack =createStack();
        reverseStack(stack);
        printStack(stack);

    }

    private Stack<Integer> createStack(){
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        return stack;
    }

    private void reverseStack(Stack<Integer> stack){

        if(stack.empty()){
            return;
        }
        Integer integer = stack.pop();
        reverseStack(stack);
        insertAtLast(stack, integer);
    }

    private void insertAtLast(Stack<Integer> stack, Integer integer){

        if(stack.empty()){
            stack.push(integer);
            return;
        }

        Integer temp = stack.pop();
        insertAtLast(stack, integer);
        stack.push(temp);
    }

    private void printStack(Stack<Integer> stack){

        while(!stack.empty()){
            System.out.print(stack.pop()+" ");
        }
        System.out.println();

    }

    private void push(int data){

        Node obj = new Node(data);
        if(first==null){
            first=obj;
        }

        obj.next=first;
        first=obj;
    }

    private Node pop(){
        if(first==null){
            return null;
        }
        Node temp = first;
        first = first.next;
        return temp;
    }

    private Node peek(){
        return first;
    }
    private boolean isEmpty(){
        return first==null;
    }
}
