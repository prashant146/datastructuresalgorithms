package datastructuresandalgorithms.binary.tree.traversal;

import datastructuresandalgorithms.binary.tree.Node;

public class Traverse {

    Node root;

    public void inorderTreeTraverse(Node root){
        if(root==null){
            return;
        }
        inorderTreeTraverse(root.getlChild());
        System.out.print(root.getData()+" ");
        inorderTreeTraverse(root.getrChild());
    }
}
