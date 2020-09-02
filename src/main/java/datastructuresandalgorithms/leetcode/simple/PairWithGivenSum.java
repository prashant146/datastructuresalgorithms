package datastructuresandalgorithms.leetcode.simple;

import java.util.HashMap;
import java.util.Map;

public class PairWithGivenSum {

    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        int[] out = new int[2];
        for(int i=0; i<nums.length; i++){
            int diff = target-nums[i];
            if(map.containsKey(diff)){
                if(map.get(diff)<i){
                    out[0]=map.get(diff);
                    out[1]=i;
                }else{
                    out[0]=i;
                    out[1]=map.get(diff);
                }

                return out;
            }else{
                map.put(nums[i], i);
            }

        }
    return out;

    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        printArray(arr);

        int[] out = twoSum(arr, 9);
        printArray(out);

    }

    public static void printArray(int[] arr){
        for(int i=0 ;i<arr.length; i++){
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
    }

}
