package datastructuresandalgorithms.binary.tree.traversal;

import datastructuresandalgorithms.binary.tree.Node;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversalInSpiralForm {

    Node root;

    public static void main(String[] args) {
        LevelOrderTraversalInSpiralForm solution = new LevelOrderTraversalInSpiralForm();
        solution.insert(1);
        solution.insert(2);
        solution.insert(3);
        solution.insert(4);
        solution.insert(5);
        solution.insert(6);
        solution.insert(7);
        solution.print(solution.root);
    }
   /*   1
        2 3
        4 5 6 7 */

    public void print(Node root){
        int height = getHeightOfTree(root);
        boolean flip = true;
        for(int i=1; i<=height;i++){
            print(root, i, flip);
            flip=!flip;
        }

    }

    public void print(Node root, int level, boolean flip){

        if(root == null){
            return;
        }
        if(level==1) {
            System.out.print(root.getData() + "  ");
            return;
        }

        if(flip){
            print(root.getlChild(), level-1, flip);
            print(root.getrChild(), level-1, flip);
        }else{
            print(root.getrChild(), level-1, flip);
            print(root.getlChild(), level-1, flip);
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

    public static int getHeightOfTree(Node root){

        if(root ==null)
            return 0;

        int lHeight = getHeightOfTree(root.getlChild());
        int rHeight = getHeightOfTree(root.getrChild());

        return (lHeight>rHeight) ? lHeight+1:rHeight+1;

    }
}
