package datastructuresandalgorithms.binarysearch;

public class InorderFromLevelOrderArray {


   /* Sorted order printing of a given array that represents a BST
    Given an array that stores a complete Binary Search Tree, write a function that efficiently prints the
    given array in ascending order.

    For example, given an array [4, 2, 5, 1, 3], the function should print 1, 2, 3, 4, 5*/

   public static void inorderFromLevelOrder(int arr[], int start, int end){

       if(start>end)
           return;

       inorderFromLevelOrder(arr, 2*start+1, end);
       System.out.print(arr[start]+"  ");
       inorderFromLevelOrder(arr, 2*start+2, end);

   }

    public static void main(String[] args) {
        int arr[] = {4, 2, 5, 1, 3};
        inorderFromLevelOrder(arr, 0, 4);
    }


}
