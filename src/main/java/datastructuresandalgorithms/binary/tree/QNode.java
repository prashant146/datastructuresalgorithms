package datastructuresandalgorithms.binary.tree;

public class QNode{

    int hd;

    public QNode(int hd, Node root){
        this.hd = hd;
        this.root = root;
    }

    Node root;

    public int getHd(){
        return hd;
    }

    public void setHd(int hd){
        this.hd = hd;
    }

    public Node getRoot(){
        return root;
    }

    public void setRoot(Node root){
        this.root = root;
    }
}
