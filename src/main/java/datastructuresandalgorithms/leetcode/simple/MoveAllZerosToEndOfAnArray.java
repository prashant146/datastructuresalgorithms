package datastructuresandalgorithms.leetcode.simple;

public class MoveAllZerosToEndOfAnArray {

    public static void pushZerosToEnd(int nums[]){
        int count =0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=0){
                nums[count++]=nums[i];
            }
        }

        while(count<nums.length){
            nums[count++] =0;
        }

    }

    public static void printArray(int[] arr){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        pushZerosToEnd(arr);
    }

}
