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
            recMergeSort(workSpace, lowerBound, mid);
            recMergeSort(workSpace, mid+1, upperBound);
            System.out.println(lowerBound+"----"+ (mid+1)+"----"+ upperBound);
            merge(workSpace, lowerBound, mid+1, upperBound);

        }
    }
    private void merge(long[] workSpace, int lowPtr, int highPtr, int upperBound) {
        int j = 0;
        int lowerBound = lowPtr;
        int mid = highPtr-1;
        int n = upperBound-lowerBound+1;

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

}