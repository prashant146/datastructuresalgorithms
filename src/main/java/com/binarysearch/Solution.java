package com.binarysearch;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Stack;

public class Solution {

    Node root;
    int count =1;

    public static void main(String[] args) {

        Solution solution = new Solution();
        solution.insert(10);
        solution.insert(5);
        solution.insert(15);
        solution.insert(3);
        solution.insert(6);
        solution.insert(13);
        solution.insert(18);
        /*solution.inorderTraverse(solution.root);
        System.out.println();
        solution.delete(5);
        solution.inorderTraverse(solution.root);
        System.out.println(solution.isBST(solution.root, Integer.MIN_VALUE, Integer.MAX_VALUE));*/
        //System.out.println(solution.ifDeadNode(solution.root));
        //solution.nonRecursiveInOrderTraversal();
        //System.out.println();
        //solution.kthLargestInBST(solution.root, 4);
        int arr[] ={10, 9, 8, 7, 6, 5, 4, 13 ,2, 1};
        System.out.println(solution.hasOnlyOneChile(arr));


    }

    public boolean hasOnlyOneChile(int arr[]){

        int nextDiff, endDiff;
        for(int i=0; i<arr.length-1; i++){
            nextDiff = arr[i]-arr[i+1];
            endDiff = arr[i] -arr[arr.length-1];
            if(nextDiff*endDiff<0){
                return false;
            }
        }
        return true;

    }

    public void kthLargestInBST(Node root, int k){

        if(root==null){
            return;
        }

        kthLargestInBST(root.right, k);
        count++;
        if(count==k){
            System.out.println("Kth largest is :"+root.data);
            return;
        }
        kthLargestInBST(root.left, k);

    }

    public void nonRecursiveInOrderTraversal(){
        Stack<Node> stack = new Stack<>();
        Node current = root;
        stack.push(current);

        while(!stack.isEmpty()){

            if(current!=null){
                stack.push(current);
                current=current.left;
            }else{
                current = stack.pop();
                System.out.print(current.data+"  ");
                current=current.right;

            }

        }



    }

    public void storeNodes(Node root, HashSet<Integer>allNodes, HashSet<Integer>leafNodes ){
        if(root==null){
            return;
        }
        allNodes.add(root.data);
        if(root.left==null && root.right==null){
            leafNodes.add(root.data);
        }

        storeNodes(root.left, allNodes, leafNodes);
        storeNodes(root.right, allNodes, leafNodes);

    }

    /*Check whether BST contains Dead End or not
    Given a Binary search Tree that contains positive integer values greater then 0. The task is to check whether the BST contains a dead end or not. Here Dead End means, we are not able to insert any element after that node.

    Examples:

    Input :        8
            /   \
            5      9
            /   \
            2     7
            /
            1
    Output : Yes
    Explanation : Node "1" is the dead End because
    after that we cant insert any element.

            Input :       8
            /   \
            7     10
            /      /   \
            2      9     13

    Output : Yes
    Explanation : We can't insert any element at
    node 9.*/

    public boolean ifDeadNode(Node root){

        HashSet<Integer>allNodes = new HashSet<>();
        HashSet<Integer>leafNodes = new HashSet<>();
        allNodes.add(0);
        storeNodes(root, allNodes, leafNodes);

        Iterator<Integer> iterator = leafNodes.iterator();
        while(iterator.hasNext()){
            Integer temp = iterator.next();
            if(allNodes.contains(temp+1)||allNodes.contains(temp-1)){
                System.out.println("dead end exists for Node:"+temp);
                return true;
            }
        }

        return false;

    }

    /*Largest number in BST which is less than or equal to N
    We have a binary search tree and a number N. Our task is to find the greatest number in the binary search tree
    that is less than or equal to N. Print the value of the element if it exists otherwise print -1.
    BST*/

    public int findMaxForN(Node root, int n){

        if(root.left==null && root.right==null && root.data>n){
            return -1;
        }

        if(root.data<n && root.right==null||
                (root.data<n && root.right.data>n)){
            return root.data;
        }

        if(root.data>n){
            return findMaxForN(root.left, n);
        }else{
            return  findMaxForN(root.right, n);
        }

    }



    public boolean isBST(Node root, int min, int max){

        if(root==null)
            return true;

        if(root.data>max ||root.data<min)
            return false;

        return isBST(root.left, min, root.data-1)&&
                isBST(root.right, root.data+1, max);
    }

    public boolean delete(int data){

        Node current = root;
        Node parent=root;
        boolean isLeftChild = false;
        while(current.data!=data){
            parent=current;
            if(data<current.data){
                isLeftChild=true;
                current=current.left;
            }else {
                isLeftChild=false;
                current=current.right;
            }
            if (current==null)
                return false;
        }

        if (current.left==null&&current.right==null){
            if (current==root)
                root = null;
            else if (isLeftChild){
                parent.left=null;
            }else
                parent.right=null;
        }else if (current.right==null){
            if (isLeftChild){
                parent.left=current.left;
            }else
                parent.right=current.left;
        }else if (current.left==null){
            if (isLeftChild)
                parent.left=current.right;
            else
                parent.right=current.right;
        }else{

            Node successor = getSuccessor(current);

            if(isLeftChild){
                parent.left=successor;
            }else
                parent.right=successor;

            successor.left=current.left;


        }
        return true;

    }

    public Node getSuccessor(Node delNode){
        Node successorParent = delNode;
        Node successor = delNode;
        Node current = delNode.right;

        while(current!=null){
            successorParent=successor;
            successor=current;
            current=current.left;
        }

        if(successor!=delNode.right){
            successorParent.left=successor.right;
            successor.right=delNode.right;
        }



        return successor;

    }

    public Node find(int data){

        Node current = root;
        if(current==null)
            return null;

        while(current.data!=data){
            if(data<current.data)
                current=current.left;
            else
                current=current.right;

            if(current==null)
                return null;
        }

        return current;
    }

    public void insert(int data){

        Node obj = new Node(data);
        Node current = root;
        Node parent;
        if(root==null){
            root = obj;
            return ;
        }else {
            while(true){
                parent=current;
                if(data<current.data){
                    current=current.left;
                    if(current==null){
                        parent.left=obj;
                        return ;
                    }
                }else{
                    current=current.right;
                    if (current==null){
                        parent.right=obj;
                        return ;
                    }
                }
            }
        }
    }

    public void inorderTraverse(Node root){
        if(root==null)
            return;

        inorderTraverse(root.left);
        System.out.print(root.data+"  ");
        inorderTraverse(root.right);
    }
}
