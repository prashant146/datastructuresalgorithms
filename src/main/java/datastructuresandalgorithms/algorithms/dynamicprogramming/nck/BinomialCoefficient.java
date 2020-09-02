package datastructuresandalgorithms.algorithms.dynamicprogramming.nck;

public class BinomialCoefficient {

    private static int getBinomialCoefficient(int n, int k){
        if(k==0 || k==n){
            return 1;
        }

        return getBinomialCoefficient(n-1, k-1) + getBinomialCoefficient(n-1, k);
    }

    public static void main(String[] args) {
        int n=10;
        int k=3;
        System.out.println(n+"C"+k+" is:"+getBinomialCoefficient(n, k));
        System.out.println(binomialCoeff(n,k));
    }

    /** eg 5C4
     *      0       1       2       3       4       5
     * 0    0C0     0C1     0C2     0C3     0C4     0C5
     * 1    1C0     1C1     1C2     1C3     1C4     1C5
     * 2    2C0     2C1     2C2     2C3     2C4     2C5
     * 3    3C0     3C1     3C2     3C3     3C4     3C5
     * 4    4C0     4C1     4C2     4C3     4C4     4C5
     * 5    5C0     5C1     5C2     5C3     5C4     5C5
     *
     *      0       1       2       3       4       5
     * 0    1       X       X       X       X       X
     * 1    1       1       X       X       X       X
     * 2    1       2       1       X       X       X
     * 3    1       3       3       1       X       X
     * 4    1       4       6       4       1       X
     * 5    1       5       10      10      5       X
     *
     *
     * @param n
     * @param k
     * @return
     */
    private static int binomialCoeff(int n, int k){
        int[][] dynmaicArray = new int[n+1][k+1];
        for(int i=0; i<=n; i++){
            for(int j=0; j<=min(i,k); j++){
                if(j==0 ||j==i){
                    dynmaicArray[i][j]=1;
                }else{
                    dynmaicArray[i][j]=dynmaicArray[i-1][j-1] + dynmaicArray[i-1][j];
                }

            }
        }
        return dynmaicArray[n][k];
    }

    private static int min(int i, int j){
        return i<j?i:j;
    }


}
