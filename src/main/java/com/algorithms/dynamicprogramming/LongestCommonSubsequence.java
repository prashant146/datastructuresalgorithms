package com.algorithms.dynamicprogramming;

public class LongestCommonSubsequence {

    public static void main(String[] args) {
        LongestCommonSubsequence longestCommonSubsequence = new LongestCommonSubsequence();
        int out = longestCommonSubsequence.LCS("ABCDGH".toCharArray(), "AEDFHR".toCharArray(), 6, 6);
        System.out.println(out);
    }

    private int LCS(char[] M, char[] N, int m, int n){

        if(m==0 || n==0)
            return 0;

        if(M[m-1] == N[n-1])
            return 1+LCS(M, N, m-1, n-1);
        else{
            return max(LCS(M, N, m, n-1), LCS(M, N, m-1, n));
        }
    }

    private int max(int a, int b){

        return a>b?a:b;
    }

}
