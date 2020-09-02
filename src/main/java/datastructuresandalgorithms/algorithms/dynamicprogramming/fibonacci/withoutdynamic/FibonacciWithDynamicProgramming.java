package datastructuresandalgorithms.algorithms.dynamicprogramming.fibonacci.withoutdynamic;

public class FibonacciWithDynamicProgramming {

    //0,1,1,2,3,5,8,13,21,34,55,89,124
    private static int fibonacci(int n){
        int arr[] = new int[n];
        arr[0]=0;
        arr[1]=1;

        for(int i=2;i<arr.length; i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        return arr[n-1];
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(10));
    }


}
