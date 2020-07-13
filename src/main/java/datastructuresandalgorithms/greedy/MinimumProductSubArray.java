package datastructuresandalgorithms.greedy;



public class MinimumProductSubArray {

    /** Case1: No negative and no 0.
     *         eg: 1, 3, 7, 10 ...
     *         min product is min positive value which is 1
     *
     *  Case2: Even Negative and no 0's
     *         eg: -21, -7, -3, -1, 3, 6 ...
     *         min Product is product of all divided by minNegative ie -(21 x -7 x -3 x -1 x 3 x 6) / -1
     *
     *  Case3: Odd Negative numbers and no 0's
     *         eg: -21, -7, -3, 3, 5
     *         min Product is product of all ie -21 x -7 x -3 x 3 x 5
     *
     *  Case4: All 0's. product would be 0
     *
     *  Case5: 0 and positive numbers
     *         eg: 0, 1, 3, 6
     *         min Product would be 0
     *
     *  Case6: Case 2 and Case 3 with 0's
     *          min Product would be same without 0
     *
     *
     * @param a
     * @param n
     * @return
     */
    public static int minProductSubset(int[] a, int n){
        if(n==1){
            return a[0];
        }

        int maximumNegative = Integer.MIN_VALUE;
        int minimumPositive = Integer.MAX_VALUE;
        int countZero= 0;
        int countNegative = 0;
        int product =1;

        for(int i=0; i<a.length;i++){

            if(a[i]==0){
                countZero++;
                continue;
            }

            if(a[i]<0){
                countNegative++;
                maximumNegative=Math.max(maximumNegative, a[i]);
            }

            if(a[i]>0 && a[i] < minimumPositive){
                minimumPositive=a[i];
            }

            product = product * a[i];

        }

        if(countNegative % 2 == 0 && countNegative!=0){
            product = product / maximumNegative;
        }else if((countZero != 0 && countNegative==0) || countZero==n){
            product=0;
        }else if(countZero==0 && countNegative==0){
            product = minimumPositive;
        }

        return product;

    }

    public static void main(String[] args){
        int[] a = { -1, -1, -2, 4, 3 };
        int n = 5;

        System.out.println(minProductSubset(a, n));
    }



}
