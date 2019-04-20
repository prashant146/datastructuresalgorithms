package datastructuresandalgorithms.binary.tree.util;

import datastructuresandalgorithms.binary.tree.Node;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeUtil {

    public Node root;
    public BinaryTreeUtil(Node root){
        this.root=root;
    }

    public static int getHeightOfTree(Node root){

        if(root ==null)
            return 0;

        int lHeight = getHeightOfTree(root.getlChild());
        int rHeight = getHeightOfTree(root.getrChild());

        return (lHeight>rHeight) ? lHeight+1:rHeight+1;

    }

    public void insert(int arr[]){
        for(int i : arr){
            insert(i);
        }
    }

    public Node insert(int data){

        Node node = new Node(data);
        Queue<Node> queue = new LinkedList<>();
        if(root==null) {
            root = node;
            return root;
        }

        queue.add(root);
        while(true){
            Node temp = queue.poll();
            if(temp.getlChild()!=null)
                queue.add(temp.getlChild());
            else {
                temp.setlChild(node);
                return this.root;
            }

            if(temp.getrChild()!=null)
                queue.add(temp.getrChild());
            else{
                temp.setrChild(node);
                return this.root;
            }
        }

    }


    public void printTree(){
        if(root ==null)
            return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(true){
            if(queue.isEmpty())
                return;
            Node temp = queue.poll();
            System.out.println(temp.getData());

            if(temp.getlChild()!=null){
                queue.add(temp.getlChild());
            }
            if(temp.getrChild()!=null)
                queue.add(temp.getrChild());
        }

    }



}
