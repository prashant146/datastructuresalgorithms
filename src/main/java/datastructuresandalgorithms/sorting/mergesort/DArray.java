package datastructuresandalgorithms.sorting.mergesort;

class DArray {
    private long[] theArray;
    private int nElems;

    public DArray(int max){
        theArray=new long[max];
        nElems=0;
    }

    public void insert(long value) {
        theArray[nElems] = value; nElems++;
    }
    public void display() {
        for(int j=0; j<nElems; j++) {
            System.out.print(theArray[j] + " ");
        }
        System.out.println();

    }
    public void mergeSort() {
        long[] workSpace = new long[nElems];
        recMergeSort(workSpace, 0, nElems-1);
    }
    private void recMergeSort(long[] workSpace, int lowerBound, int upperBound) {
        if(lowerBound == upperBound)
            return;
        else{
            int mid = (lowerBound+upperBound) / 2;
            System.out.println("Before merge: lowerBound:"+lowerBound+" mid:"+mid+" upperBound:"+upperBound);
            recMergeSort(workSpace, lowerBound, mid);
            recMergeSort(workSpace, mid+1, upperBound);
            System.out.println("After merge: lowerBound:"+lowerBound+" mid+1:"+(mid+1)+" upperBound:"+upperBound);
            merge(workSpace, lowerBound, mid+1, upperBound);

        }
    }

    //[0, 5]; [0,2; 3,5]; [0,1; 2,2; 3,4; 5,5]; [0,0; 1,1; 2,2; 3,3; 4,4; 5,5]

    private void merge(long[] workSpace, int lowPtr, int highPtr, int upperBound) {
        int j = 0;
        int lowerBound = lowPtr;
        int mid = highPtr-1;
        int n = upperBound-lowerBound+1;
        System.out.println("printing workspace");
        print(workSpace);
        while(lowPtr <= mid && highPtr <= upperBound) {
            if( theArray[lowPtr] < theArray[highPtr] )
                workSpace[j++] = theArray[lowPtr++];
            else
                workSpace[j++] = theArray[highPtr++];
        }


        while(lowPtr <= mid)
            workSpace[j++] = theArray[lowPtr++];

        while(highPtr <= upperBound)
            workSpace[j++] = theArray[highPtr++];

        for(j=0; j<n; j++)
            theArray[lowerBound+j] = workSpace[j];

        for(int k =0; k<workSpace.length;k++){
            System.out.print(workSpace[k]+" ");
        }
        System.out.println();

        for(int l=0; l<theArray.length;l++){
            System.out.print(theArray[l]+" ");
        }
        System.out.println();
    }

    public void print(long arr[]){
        for(int i=0 ;i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
    }

}