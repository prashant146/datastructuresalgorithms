package datastructuresandalgorithms.greedy;

public class MaximumProductSubArray {

    /**Case1: Odd negative integers and no 0's
     *        eg: -10, -6, -1, 4, 5
     *        min Product would be -10 x -6 x 4 x 5 = 1200
     *
     *Case2: Even negative integers and no 0's
     *        eg: -10, -8, -6, -1, 2, 5
     *        min Product would be -10 x -8 x -6 x -1 x 2 x 5
     *
     *Case3: Even/Odd negative numbers with 0
     *        min Product would be: same as above, ignore 0
     *
     *Case4: Only 0's
     *       min Product would be: 0
     *
     *Case5: 0, 1, 2, 6, 12
     *       min Product would be: 1 x 2 x 6 x 12
     *
     *
     * @param arr
     * @param n
     * @return
     */
    public int maxProductSubset(int[]arr, int n){
        if(arr.length==1){
            return arr[0];
        }

        int maxNegative = Integer.MIN_VALUE;
        int minPositive = Integer.MAX_VALUE;
        int countNegative = 0;
        int countZero = 0;
        int product =1;

        for(int i=0; i<arr.length; i++){
            if(arr[i]==0){
                countZero++;
                continue;
            }

            if(arr[i]<0){
                countNegative++;
                maxNegative = Math.max(arr[i], maxNegative);
            }else if(arr[i]>=0){
                minPositive = Math.min(arr[i], minPositive);
            }
            product = product* arr[i];
        }

        if((countZero > 0 && minPositive==Integer.MAX_VALUE) || countZero==n ){
            return 0;
        }

        if(countNegative%2!=0){
            product=product/maxNegative;
        }

        return product;
    }

}
