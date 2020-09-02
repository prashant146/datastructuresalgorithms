package datastructuresandalgorithms.binary.tree;

import datastructuresandalgorithms.binary.tree.util.BinaryTreeUtil;

import java.util.LinkedList;
import java.util.Queue;

public class PrintGivenLevelInBinaryTree {

    Node root;

    public static void main(String[] args) {
        PrintGivenLevelInBinaryTree solution = new PrintGivenLevelInBinaryTree();
        solution.insert(1);
        solution.insert(2);
        solution.insert(3);
        solution.insert(4);
        solution.insert(5);
        solution.insert(6);
        solution.insert(7);
        solution.printGivenLevel(solution.root, 3);
    }

    public void printGivenLevel(Node root){

        int height = getHeightOfTree(root);
        for(int i=1; i<=height;i++){
            printGivenLevel(root, i);
        }


    }

    public void printGivenLevel(Node root, int level){

        if(root==null)
            return;

        if(level==1) {
            System.out.print(root.getData() + "  ");
            return;
        }

        printGivenLevel(root.getlChild(), level-1);
        printGivenLevel(root.getrChild(), level-1);
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

    public static int getHeightOfTree(Node root){

        if(root ==null)
            return 0;

        int lHeight = getHeightOfTree(root.getlChild());
        int rHeight = getHeightOfTree(root.getrChild());

        return (lHeight>rHeight) ? lHeight+1:rHeight+1;

    }


    }
