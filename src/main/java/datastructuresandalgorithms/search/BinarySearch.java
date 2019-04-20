package datastructuresandalgorithms.search;

public class BinarySearch {

    public static void main(String[] args) {
        int arr[] = {1,3,5,10,12,13,16,19, 21, 22};
        BinarySearch binarySearch = new BinarySearch();
        binarySearch.search(arr, 51);
    }

    public void search(int[] arr, int n){

        System.out.println(search(arr, 0, arr.length, n));

    }

    public int search(int[] arr, int low, int high, int num){

        if(low>high||high>=arr.length){
            return -1;
        }
        int mid = (low+high)/2;
        if(arr[mid]==num){
            return mid;
        }else if(num>arr[mid]){
            return search(arr, mid+1, high,num);
        }else{
            return search(arr, low, mid-1, num);
        }
    }


}
