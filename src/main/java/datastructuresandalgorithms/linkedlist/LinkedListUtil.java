package datastructuresandalgorithms.linkedlist;

public class LinkedListUtil {

    public void addNodeAtEnd(Node first, int data){

        Node node =new Node(data);
        if(first==null){
            first = node;
            return;
        }
        Node current = first;
        while(current.next!=null){
            current=current.next;
        }

        current.next=node;
    }

    public void printLinkedList(Node first){

        if(first==null){
            return;
        }

        Node current = first;
        while(current!=null){
            System.out.print(current.data+"   ");
            current=current.next;
        }
    }

    public void addNodeAtStart(Node first, int data){

    }

}
