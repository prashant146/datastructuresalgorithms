package datastructuresandalgorithms.algorithms.dynamicprogramming;

public class BinomialCoefficient {

    /*

    nCk = n-1 C k-1 + n-1 C k

     */

    private int getBinomialCoefficient(int n, int k){
        if(n==k || k==0){
            return 1;
        }

        return getBinomialCoefficient(n-1, k) + getBinomialCoefficient(n-1, k-1);
    }

    public static void main(String[] args) {
        BinomialCoefficient binomialCoefficient = new BinomialCoefficient();
        System.out.println(binomialCoefficient.getBinomialCoefficient(5, 2));
    }

    /*private int dynamicProgrammingSolution(int n, int k){
        int c[][] = new int[n+1][k+1];

        c[0][]
    }*/
}
