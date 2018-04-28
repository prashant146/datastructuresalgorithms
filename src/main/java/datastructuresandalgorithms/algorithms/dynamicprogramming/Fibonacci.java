package datastructuresandalgorithms.algorithms.dynamicprogramming;

public class Fibonacci {

    final int MAX = 100;
    final int INIT = -1;
    int arr[];

    public Fibonacci(){
        arr = new int [MAX];
        for(int i=0; i<MAX;i++)
            arr[i]=INIT;
    }

    private int getNthNumberOfFibonacci(int n){

        if(arr[n]==INIT){
            if(n<=1){
                arr[n]=n;
            }else{
                arr[n] = getNthNumberOfFibonacci(n-1)+getNthNumberOfFibonacci(n-2);
            }
        }
        return arr[n];
    }

    private int dynamicApproachBottomUp(int n){

        int arr[] = new int[n+1];
        arr[0]=0;
        arr[1]=1;

        for(int i=2; i<=n;i++){
            arr[i] = arr[i-1]+arr[i-2];
        }

        return arr[n];

    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        System.out.println(fibonacci.getNthNumberOfFibonacci(10));
        System.out.println(fibonacci.dynamicApproachBottomUp(10));
    }

}
