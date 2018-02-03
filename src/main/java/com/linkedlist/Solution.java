package com.linkedlist;

public class Solution {

    private Node first;

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
        solution.displayLinkedList();
        /*solution.deleteNode(4);
        solution.deleteNode(1);
        solution.displayLinkedList();*/
        /*System.out.println("length of LL =:"+solution.lenghOfLinkedList());
        System.out.println("rec length of LL=:"+solution.recLengthOfLL(solution.first));
        Node obj = solution.getElementInLL(solution.first, 51);
        int data = obj==null ? 0:obj.data;
        System.out.println("Element is present : "+data);
        solution.swapNodes(2, 9);*/
        solution.nthFromLast(10);
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

    public void displayLinkedList(){
        Node current = first;
        while(current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }
        System.out.println();
    }

}
