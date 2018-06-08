package javamodules.concurrent.forkjoinpool;

import java.util.Arrays;
import java.util.concurrent.RecursiveTask;

public class ForkJoinSearcher extends RecursiveTask<Boolean> {

    private int[] arr;
    private int searchableElement;
    ForkJoinSearcher(int[] arr,int search)
    {
        this.arr = arr;
        this.searchableElement=search;
    }

    @Override
    protected Boolean compute() {

        int mid = arr.length/2;
        if(arr[mid]==searchableElement){
            System.out.println("Found the element:"+searchableElement+" at index:"+mid);
            return true;

        }else if(arr.length==1){
            System.out.println("Element is not available");
            return false;

        }else if(searchableElement<arr[mid]){
            int[] left = Arrays.copyOfRange(arr, 0, mid);
            ForkJoinSearcher forkJoinSearcher = new ForkJoinSearcher(left, searchableElement);
            forkJoinSearcher.fork();
            return forkJoinSearcher.join();

        }else if(searchableElement > arr[mid]){
            System.out.println(Thread.currentThread().getName() + " says :: Doing Right-search");
            int[] right = Arrays.copyOfRange(arr, mid, arr.length);
            ForkJoinSearcher forkTask = new ForkJoinSearcher(right,searchableElement);
            forkTask.fork();
            return forkTask.join();
        }
        return false;
    }
}
