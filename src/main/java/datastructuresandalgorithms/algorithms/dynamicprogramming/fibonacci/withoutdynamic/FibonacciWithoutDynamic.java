package datastructuresandalgorithms.algorithms.dynamicprogramming.fibonacci.withoutdynamic;

public class FibonacciWithoutDynamic {

    //0,1,1,2,3,5,8,13,21,34,55,89,124
    private static int getNthFibonacci(int n){
        if(n==2||n==3){
            return 1;
        }
        if(n<=1){
            return 0;
        }
        return getNthFibonacci(n-1)+getNthFibonacci(n-2);
    }

    public static void main(String[] args) {
        System.out.println(getNthFibonacci(10));
    }
}
