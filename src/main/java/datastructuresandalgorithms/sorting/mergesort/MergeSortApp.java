package datastructuresandalgorithms.sorting.mergesort;

public class MergeSortApp {

    public static void main(String[] args) {
        int maxSize = 6;
        DArray arr;
        arr = new DArray(maxSize);
        arr.insert(2);
        arr.insert(1);
        arr.insert(5);
        arr.insert(3);
        arr.insert(4);
        arr.insert(0);

        arr.display();
        arr.mergeSort();
        arr.display();

    }
}
