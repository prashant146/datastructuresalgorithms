package datastructuresandalgorithms.leetcode.hard;

public class MedianOfTwoSortedArrays {

    public static void main(String[] args) {
        int[] arr1 = {1, 2};
        int[] arr2 = {3, 4};
        System.out.println(findMedianSortedArrays(arr1, arr2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] mergedArray = merge(nums1, nums2);

        if(mergedArray.length==1){
            return mergedArray[0];
        }else if(mergedArray.length%2!=0){
            int middle = mergedArray.length/2;
            return mergedArray[middle];
        }else{
            int middle = mergedArray.length/2;
            return (mergedArray[middle]+(double)mergedArray[middle-1])/2;
        }
    }

    public static int[] merge(int[] arr1, int[] arr2){
        int cnt1 = 0;
        int cnt2 = 0;
        int cnt=0;
        int[] arr = new int[arr1.length+arr2.length];
        while(cnt1<arr1.length && cnt2<arr2.length){
            if(arr1[cnt1]<arr2[cnt2]){
                arr[cnt++]=arr1[cnt1++];
            }else{
                arr[cnt++]=arr2[cnt2++];
            }
        }

        while(cnt1<arr1.length){
            arr[cnt++]=arr1[cnt1++];
        }

        while(cnt2<arr2.length){
            arr[cnt++]=arr2[cnt2++];
        }
        return arr;
    }
}
