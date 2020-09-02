package datastructuresandalgorithms.array;

public class ArrayRotation {

    /**
     *
     * @param arr
     * @param d
     * Description: Array rotate by d using temp array
     */
    private void method1(int[] arr, int d){

        if(d>arr.length){
            System.out.println("rotation is greater than array length");
        }
        int tempArr[] = new int[d];

        for(int i=0; i<d;i++){
            tempArr[i] = arr[i];
        }

        //for(int i=d)

    }

    private static void method2(int arr[], int d){

        d= d%arr.length;

        printArray(arr);
        rotate(arr, 0, d-1);
        rotate(arr, d, arr.length-1);
        rotate(arr, 0, arr.length-1);
        printArray(arr);

    }

    private static void rotate(int arr[], int start, int end){

        while (start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] =temp;
            start++;
            end--;
        }
    }

    private static void printArray(int arr[]){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        method2(arr, 7);


    }

}
