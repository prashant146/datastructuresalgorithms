package datastructuresandalgorithms.leetcode.simple.string;


import org.apache.commons.lang.StringEscapeUtils;

public class ReverseString{

    public void reverseString(char[] s) {
        int start = 0;
        int end = s.length-1;

        while(start<=end){
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }

    public static int reverse(int x) {
        System.out.println(Integer.MAX_VALUE);
        if(x>Math.pow(2, 31) || x< Math.pow(2, -31)){
            return 0;
        }
        int revNumber = 0;
        int remainder = 0;
        while(x!=0){
            remainder = x%10;
            x = x/10;
            revNumber = revNumber * 10 + remainder;
        }
        return revNumber;
    }

    public static void main(String[] args) {

        System.out.println(StringEscapeUtils.escapeJava("\\\n\t\r"));
        /*System.out.println(reverse(1534236469));
        //1534236469
        //2147483647

        int arr[] = {0, 1};
        int[] out = productExceptSelf(arr);
        printArray(out);*/
    }

    //0 ,1, 2, 3
    //6, 0, 0, 0

    //[1, 0]
    //[0, 1]

    public static int[] productExceptSelf(int[] nums) {
        int product = 1;
        int zeroCount = 0;
        for(int i=0; i<nums.length;i++){
            if(nums[i]!=0){
                product=product*nums[i];
            }else{
                zeroCount++;
            }
        }

        if(zeroCount>1||zeroCount==1 && nums.length==1){
            for(int i=0; i<nums.length;i++){
                nums[i]=0;
            }
        }else{
            for(int i=0; i<nums.length; i++){
                if(zeroCount==1){
                    if(nums[i]!=0){
                        nums[i] = 0;
                    }else{
                        nums[i]=product;
                    }
                }else{
                    nums[i] = product/nums[i];
                }
            }
        }

        return nums;
    }

    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }




}
