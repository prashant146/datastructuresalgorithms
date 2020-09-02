package datastructuresandalgorithms.binary.tree.traversal;

import datastructuresandalgorithms.binary.tree.Node;
import datastructuresandalgorithms.binary.tree.util.BinaryTreeUtil;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class LevelOrder {

    Node root;

    public static void main(String[] args) {
        LevelOrder levelOrder = new LevelOrder();
        BinaryTreeUtil obj = new BinaryTreeUtil(levelOrder.root);
        int nodes[] = {1, 2, 3, 4, 5, 6, 7};
        obj.insert(nodes);
        levelOrder.root=obj.root;
        levelOrder.printBinaryTreeInGivenOrder(levelOrder.root);
    }

    public void printBinaryTreeInGivenOrder(Node root){

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){

            Node temp = queue.poll();
            System.out.print(temp.getData()+" ");
            if(temp.getlChild()!=null)
                queue.add(temp.getlChild());
            if(temp.getrChild()!=null)
                queue.add(temp.getrChild());



        }
    }

}
