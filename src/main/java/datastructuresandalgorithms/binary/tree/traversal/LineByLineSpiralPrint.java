package datastructuresandalgorithms.binary.tree.traversal;

import datastructuresandalgorithms.binary.tree.Node;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class LineByLineSpiralPrint {

    Node root;

    public static void main(String[] args) {
        LineByLineSpiralPrint solution = new LineByLineSpiralPrint();
        solution.insert(1);
        solution.insert(2);
        solution.insert(3);
        solution.insert(4);
        solution.insert(5);
        solution.insert(6);
        solution.insert(7);
        solution.print();
    }

    public void print(){

        Stack<Node> current = new Stack<>();
        Stack<Node> next = new Stack<>();
        current.push(root);
        boolean leftToRight = true;

        while(!current.isEmpty()){

            Node out = current.pop();
            System.out.print(out.getData()+"  ");

            if(leftToRight){
                if(out.getlChild()!=null){
                    next.push(out.getlChild());
                }
                if(out.getrChild()!=null){
                    next.push(out.getrChild());
                }
            }else{
                if(out.getrChild()!=null){
                    next.push(out.getrChild());
                }
                if(out.getlChild()!=null){
                    next.push(out.getlChild());
                }
            }
            if(current.isEmpty()){
                leftToRight=!leftToRight;
                Stack<Node> temp = current;
                current=next;
                next = temp;
                System.out.println();
            }
        }
    }

    public void insert(int data) {

        Node node = new Node(data);
        Queue<Node> queue = new LinkedList<>();
        if (root == null) {
            root = node;
            return;
        }

        queue.add(root);
        while (true) {
            Node temp = queue.poll();
            if (temp.getlChild() != null)
                queue.add(temp.getlChild());
            else {
                temp.setlChild(node);
                return;
            }

            if (temp.getrChild() != null)
                queue.add(temp.getrChild());
            else {
                temp.setrChild(node);
                return;
            }
        }
    }

}
