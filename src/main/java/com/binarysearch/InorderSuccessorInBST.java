package com.binarysearch;

public class InorderSuccessorInBST {

    /*
    * Inorder Successor in Binary Search Tree
        In Binary Tree, Inorder successor of a node is the next node in Inorder traversal of the Binary Tree.
        Inorder Successor is NULL for the last node in Inoorder traversal.
        In Binary Search Tree, Inorder Successor of an input node can also be defined as the node with the
        smallest key greater than the key of input node. So, it is sometimes important to find next node in sorted order.
    * */

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.insert(20);
        solution.insert(8);
        solution.insert(22);
        solution.insert(4);
        solution.insert(12);
        solution.insert(10);
        solution.insert(14);

        System.out.println("Successor of 8  :"+getSuccessor(solution.root, solution.find(8)).data);
        System.out.println("Successor of 10 :"+getSuccessor(solution.root, solution.find(10)).data);
        System.out.println("Successor of 14 :"+getSuccessor(solution.root, solution.find(14)).data);
        System.out.println("Successor of 22 :"+getSuccessor(solution.root, solution.find(22)));
    }

    private static Node getSuccessor(Node root, Node node){

        if(node.right!=null){
            return getMinimum(node.right);
        }
        Node successor = null;
        Node current = root;
        while(current!=null){

            if(node.data<current.data){
                successor=current;
                current=current.left;
            }else if(node.data>current.data){
                current=current.right;
            }else
                break;

        }
        return successor;
    }

    private static Node getMinimum(Node root){

        Node current = root;
        while(current.left!=null){
            current=current.left;
        }

        return current;
    }
}
