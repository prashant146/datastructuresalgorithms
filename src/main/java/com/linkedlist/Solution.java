package com.linkedlist;

import java.util.HashSet;

public class Solution {

    private Node first;
    private Node loopFirst;
    private int count=0;
    private Node beforePivotFirst;
    private Node afterPivotFirst;

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.insertAtLast(1);
        solution.insertAtLast(2);
        solution.insertAtLast(3);
        solution.insertAtLast(4);
        solution.insertAtLast(5);
        solution.insertAtLast(6);
        solution.insertAtLast(7);
        solution.insertAtLast(8);
        solution.insertAtLast(9);
        solution.insertAtLast(10);
        solution.displayLinkedList(solution.first);
        /*solution.deleteNode(4);
        solution.deleteNode(1);
        solution.displayLinkedList();*/
        /*System.out.println("length of LL =:"+solution.lenghOfLinkedList());
        System.out.println("rec length of LL=:"+solution.recLengthOfLL(solution.first));
        Node obj = solution.getElementInLL(solution.first, 51);
        int data = obj==null ? 0:obj.data;
        System.out.println("Element is present : "+data);
        solution.swapNodes(2, 9);*/
        /*solution.nthFromLast(10);
        solution.nthFromLastRec(solution.first, 3);
        solution.createLoopedLinkedList();
        solution.detectLoop();
        solution.displayLinkedList(solution.loopFirst);*/
        //solution.reverseLinkedList();
        //solution.displayLinkedList(solution.first);
        //solution.reverseLinkedListRecursively(solution.first, solution.first.next);
        //solution.displayLinkedList(solution.first);
        //solution.displayLinkedListFromLast(solution.first);
        //solution.first = solution.reverseInK(solution.first, 3);
        //solution.displayLinkedList(solution.first);
        //solution.deleteDups(solution.first);
        //solution.displayLinkedList(solution.first);
        Node temp = solution.nthFromLast(solution.first, 4);
        System.out.println("nth from last :"+temp.data);



    }

    private void partitionAlL(int data, int pivot){
        int[] arr = {};

        Node obj = new Node(data);

        if(data<pivot){

            if(beforePivotFirst==null){
                beforePivotFirst=obj;
            }else{
                obj.next=beforePivotFirst;
                beforePivotFirst=obj;
            }
        }else{
            if(afterPivotFirst==null){
                afterPivotFirst=obj;
            }else{
                obj.next=afterPivotFirst;
                afterPivotFirst=obj;

            }
        }
    }

    private void deleteDups(Node n){

        Node current = first;
        Node previous = null;
        HashSet<Integer> hashSet = new HashSet<>();

        while(current!=null){

            if(hashSet.contains(current.data)){
                previous.next=current.next;
            }else{
                hashSet.add(current.data);
                previous=current;

            }
            current=current.next;

        }

    }

    private Node reverseInK(Node obj, int k){

        if(obj==null)
            return null;

        Node current = obj;
        Node previous = null;
        Node temp = null;
        int count =0;

        while(current!=null && count<k){
            temp = current.next;
            current.next=previous;
            previous=current;
            current=temp;
            count++;
        }

        obj.next=reverseInK(current, k);

        return previous;

    }

    private void displayLinkedListFromLast(Node obj){
        if(obj==null)
            return;

        displayLinkedListFromLast(obj.next);
        System.out.print(obj.data+" ");
    }

    private void reverseLinkedListRecursively(Node current, Node next){
        if(current==first){
            current.next=null;
        }
        if(next==null){
            first=current;
            return;
        }
        Node temp = next.next;
        next.next=current;
        reverseLinkedListRecursively(next, temp);

    }

    private void reverseLinkedList(){

        Node current = first;
        Node previous = null;
        while(current!=null){
            Node temp =current.next;
            current.next=previous;
            previous =current;
            current=temp;
        }
        first = previous;
    }

    private void detectLoop(){

        Node slowPtr = loopFirst;
        Node fastPtr = loopFirst.next;

        while(slowPtr!=fastPtr){
            slowPtr=slowPtr.next;
            fastPtr=fastPtr.next.next;
        }
        System.out.println("slow data:"+slowPtr.data+" fast data:"+fastPtr.data);
        slowPtr=loopFirst;
        fastPtr=fastPtr.next;
        while(slowPtr.next!=fastPtr.next){
            slowPtr=slowPtr.next;
            fastPtr=fastPtr.next;
        }
        fastPtr.next=null;
    }

    private void createLoopedLinkedList(){

        insertAtLastLoop( 1);
        insertAtLastLoop( 2);
        insertAtLastLoop( 3);
        insertAtLastLoop( 4);
        insertAtLastLoop( 5);
        insertAtLastLoop( 6);
        insertAtLastLoop( 7);
        insertAtLastLoop( 8);
        insertAtLastLoop( 9);
        insertAtLastLoop( 10);


        Node current = loopFirst;
        while(current.data!=5){
            current=current.next;
        }
        Node temp =current;
        while(current.data!=10){
            current=current.next;
        }
        current.next=temp;
    }

    private Node nthFromLast(Node obj, int n){

        if(obj==null)
            return null;

        Node temp = nthFromLast(obj.next, n);
        count++;
        if(n==count){
            return obj;
        }else
            return temp;
    }

    private int nthFromLastRec(Node obj, int n){
        if(obj==null)
            return 0;

        int temp = 1+nthFromLastRec(obj.next, n);
        if(temp == n){
            System.out.println(n+"th from last recursively is : "+obj.data);
            return temp;
        }

        return temp;
    }

    private void nthFromLast(int n){
        Node current = first;
        Node curr = first;
        int count =1;
        while(count!=n && current!=null){
            current=current.next;
            count++;
        }
        if(current==null){

            System.out.println("Element not present");
            return;
        }

        while(current.next!=null){
            curr=curr.next;
            current=current.next;
        }

        System.out.println(n+ "thFromLastElementIs: "+curr.data);

    }

    private void swapNodes(int m, int n){

        Node mPrev=null;
        Node mCurr=first;
        while(mCurr!=null&&mCurr.data!=m){
            mPrev=mCurr;
            mCurr=mCurr.next;
        }

        Node nPrev=null;
        Node nCurr=first;

        while(nCurr!=null&&nCurr.data!=n){
            nPrev=nCurr;
            nCurr=nCurr.next;
        }

        if(mCurr==null||nCurr==null)
            return;
        if(mPrev!=null)
            mPrev.next=nCurr;
        else
            first=nCurr;

        if(nPrev!=null)
            nPrev.next=mCurr;
        else
            first=mCurr;

        Node temp = nCurr.next;
        nCurr.next=mCurr.next;
        mCurr.next=temp;

    }

    private Node getElementInLL(Node obj, int data){
        if(obj==null){
            System.out.println("could not find element in LL");
            return null;
        }
        if(obj.data==data){
            return obj;
        }
        return getElementInLL(obj.next, data);
    }

    private int recLengthOfLL(Node obj){
        if(obj==null)
            return 0;

        return 1+recLengthOfLL(obj.next);
    }

    private int lenghOfLinkedList(){
        Node current = first;
        int output=0;
        while(current!=null){
            output++;
            current=current.next;
        }
        return output;

    }

    private Node deleteNode(int data){

        if(first.data==data){
            Node temp = first;
            first = first.next;
            return temp;
        }

        Node current = first;
        Node previous=null;
        while(current.data!=data){
            previous=current;
            current=current.next;
        }
        previous.next=current.next;

        return current;



    }

    public void insertAtLastLoop(int data){
        Node obj = new Node(data);
        if(loopFirst==null){
            loopFirst=obj;
            return;
        }
        Node current = loopFirst;
        while(current.next!=null){
            current=current.next;
        }
        current.next=obj;
    }

    public void insertAtLast(int data){
        Node obj = new Node(data);
        if(first==null){
            first = obj;
            return;
        }
        Node current = first;
        Node previous = null;
        while(current!=null){
            previous = current;
            current = current.next;
        }

        previous.next=obj;
    }

    public void displayLinkedList(Node obj){
        Node current = obj;
        while(current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }
        System.out.println();
    }

}
