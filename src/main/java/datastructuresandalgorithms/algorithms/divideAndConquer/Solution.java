package datastructuresandalgorithms.algorithms.divideAndConquer;

import java.util.*;
        import java.lang.*;
        import java.io.*;

class Solution {
    public static void main (String[] args) {

        int arr[] = {1,1,2};
        int n=3;
            int x=arr[0];
            for(int i=1;i<n;i++){
                x=x^arr[i];
            }
            System.out.println(x);
        }
    }

