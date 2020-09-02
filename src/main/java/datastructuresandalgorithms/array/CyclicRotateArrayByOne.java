package datastructuresandalgorithms.array;

public class CyclicRotateArrayByOne {

    private static void method1(int arr[]){

        printArray(arr);
        int temp = arr[arr.length-1];
        int count = arr.length-1;
        while (count >0){

            arr[count]=arr[count-1];
            count--;

        }

        arr[count]=temp;
        printArray(arr);

    }

    private static void printArray(int[] arr){

        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        method1(arr);
    }

}
