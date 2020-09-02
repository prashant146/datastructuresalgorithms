package datastructuresandalgorithms.leetcode.simple;

public class SingleUniqueNumberInPairArray {

    public static int singleNumber(int[] nums) {

        int output = nums[0];
        for(int i=1; i<nums.length; i++){

            output = output ^ nums[i];
        }

        return output;

    }

    public static void main(String[] args) {
        int arr[] ={2,2,1, 3, 5, 1,5};
        System.out.println(singleNumber(arr));
    }
}
