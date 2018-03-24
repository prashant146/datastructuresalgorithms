package com.algorithms;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println(solution.largestContiguousSumArray(arr));
        System.out.println(solution.getNthUglyNumber(150));
    }

    /*
    * Ugly Numbers
3.3
Ugly numbers are numbers whose only prime factors are 2, 3 or 5. The sequence 1, 2, 3, 4, 5, 6, 8, 9, 10, 12, 15, … shows the first 11 ugly numbers. By convention, 1 is included.

Given a number n, the task is to find n’th Ugly number.

Input  : n = 7
Output : 8

Input  : n = 10
Output : 12

Input  : n = 15
Output : 24

Input  : n = 150
Output : 5832
    * */

    public int uglyNumbers(int a, int b){

        while(a%b==0){
            a = a/b;

        }
        return a;
    }

    public int isUgly(int n){

        int no = uglyNumbers(n, 2);
        no = uglyNumbers(no, 3);
        no = uglyNumbers(no, 5);

        return (no==1)?1:0;
    }

    public int getNthUglyNumber(int n){

        int i=1;
        int count =1;
        while(count<n){
            i++;
            if(isUgly(i)==1)
                count++;


        }
        return i;
    }

    public int largestContiguousSumArray(int[] arr){

        int max_so_far =0;
        int max_ending_here=0;

        for(int i=0; i<arr.length; i++){

            max_ending_here=max_ending_here+arr[i];
            if(max_ending_here<0){
                max_ending_here=0;
            }
            if(max_ending_here>max_so_far){
                max_so_far=max_ending_here;
            }

        }
        return max_so_far;

    }
}
