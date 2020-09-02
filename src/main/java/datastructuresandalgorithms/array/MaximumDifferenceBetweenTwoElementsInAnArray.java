package datastructuresandalgorithms.array;

public class MaximumDifferenceBetweenTwoElementsInAnArray {

    private static int maxDiff(int arr[]){
        if(arr.length<=1){
            return 0;
        }
        int maxDifference = arr[1] - arr[0];
        int minElement = arr[0];

        for(int i=1; i<arr.length; i++){
            if(arr[i]-minElement>maxDifference){
                maxDifference = arr[i]-minElement;
            }
            if(arr[i]<minElement){
                minElement=arr[i];
            }
        }
        return maxDifference;

    }


    public static void main(String[] args) {
        int arr[] = {7, 9, 5, 6, 3, 2};
        System.out.println(maxDiff(arr));
    }

}
