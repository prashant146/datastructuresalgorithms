package datastructuresandalgorithms.leetcode.simple;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementInAnArray {

    public static boolean containsDuplicate(int[] nums) {

        Set<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(set.contains(Integer.valueOf(nums[i]))){
                return true;
            }else{
                set.add(Integer.valueOf(nums[i]));
            }
        }

        return false;

    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        System.out.println(containsDuplicate(arr));
    }
}
