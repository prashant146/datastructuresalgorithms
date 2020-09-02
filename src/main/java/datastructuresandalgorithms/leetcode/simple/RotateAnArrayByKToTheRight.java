package datastructuresandalgorithms.leetcode.simple;

public class RotateAnArrayByKToTheRight {

    public static void main(String[] args) {
        int nums[] ={1,2};
        rotateArrayByK(nums, 3);
    }

    public static void rotateArrayByK(int[] nums, int k){

        if(k>nums.length){
            k=k%nums.length;
        }

        if(nums==null || nums!=null && nums.length<=1|| k<1){
            return;
        }
        int i=0;
        int j=nums.length-k-1;
        printArray(nums);
        rotateArray(nums, i, j);

        i=nums.length-k;
        j=nums.length-1;
        printArray(nums);

        rotateArray(nums, i, j);

        printArray(nums);

        rotateArray(nums, 0, nums.length-1);
        printArray(nums);
    }

    public static void rotateArray(int nums[], int start, int end){
        while(start<=end){
            int temp = nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }

    public static void printArray(int[] nums){
        for(int i=0; i<nums.length;i++){
            System.out.print(nums[i]+"  ");
        }
        System.out.println();
    }

}
