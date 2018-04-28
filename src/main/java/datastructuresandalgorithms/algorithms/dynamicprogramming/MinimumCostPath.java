package datastructuresandalgorithms.algorithms.dynamicprogramming;

public class MinimumCostPath {

    public static void main(String[] args) {
        int cost[][] = { {1, 2, 3},
            {4, 8, 2},
            {1, 5, 3} };
        MinimumCostPath minimumCostPath = new MinimumCostPath();
        int out = minimumCostPath.getMinimumCostPath(cost, 2, 2);
        System.out.println(out);
    }

    private int getMinimumCostPath(int arr[][] , int m, int n){

        if(m<0||n<0){
            return Integer.MAX_VALUE;
        }else if(m==0&&n==0){
            return arr[m][n];
        }else{
            return arr[m][n]+ min(getMinimumCostPath(arr, m-1, n-1),
                    getMinimumCostPath(arr, m-1, n),
                    getMinimumCostPath(arr, m, n-1));
        }

    }

    private int min(int a, int b, int c){

        if(a<b && a<c)
            return a;
        else if(b<a && b<c)
            return b;
        else
            return c;
    }
}
