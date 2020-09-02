package csFundamentals.binary;

public class IsPowerOfFour {

    public static boolean isPowerOfFour(int n){

        int x = n & (n-1);
        if(x!=0||n<=0){
            return false;
        }
        int count =0;

        while(n>1){
            n=n>>1;
            count++;
        }

        return count%2==0;

    }

    public static void main(String[] args) {
        System.out.println(isPowerOfFour(8));
    }

}
