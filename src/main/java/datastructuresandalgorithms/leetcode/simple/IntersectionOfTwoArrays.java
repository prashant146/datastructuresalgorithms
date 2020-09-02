package datastructuresandalgorithms.leetcode.simple;

import java.util.*;

public class IntersectionOfTwoArrays {

    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        printArray(intersect(nums1, nums2));

    }

    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for(int i=0; i< nums1.length; i++){
            Integer key = Integer.valueOf(nums1[i]);
            if(map.containsKey(key)){
                map.put(key, map.get(key)+1);
            }else{
                map.put(key, key);
            }
        }

        for(int i=0; i<nums2.length; i++){
            Integer key = Integer.valueOf(nums2[i]);
            if(map.containsKey(key) && map.get(key)!=0){
                map.put(key, map.get(key)-1);
                list.add(key);
            }
        }
        int[] myArray = new int[list.size()];
        int count =0;

        for(Integer integer : list){
            myArray[count++]=integer;
        }

        return myArray;


    }


}
