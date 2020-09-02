package datastructuresandalgorithms.leetcode.simple;

public class Add1ToTheNumberRepresentedAsArray {

    public int[] plusOne(int[] digits) {
        return add1ToTheArray(digits, digits.length);
    }
    public static int[] add1ToTheArray(int arr[], int n){
        if(n==0){
            int arr1[] = new int[arr.length+1];
            arr1[0]=1;
            return copyArray(arr1, arr);
        }

        if(arr[n-1]!=9){
            arr[n-1]=arr[n-1]+1;
        }else{
            arr[n-1]=0;
            return add1ToTheArray(arr, n-1);
        }
        return arr;
    }

    public static int[] copyArray(int[] arr1, int[] arr2){
        int j=1;
        for(int i=0; i<arr2.length; i++){
            arr1[j++] = arr2[i];
        }
        return arr1;
    }

    public static void main(String[] args) {
        int arr[] ={9,1,9,9};
        int[] out = add1ToTheArray(arr, arr.length);
    }



}
