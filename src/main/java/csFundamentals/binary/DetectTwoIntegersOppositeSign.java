package csFundamentals.binary;

public class DetectTwoIntegersOppositeSign {

    // XOR :   1 0 : 1
    /*         0 1 : 1
               1 1 : 0
               0 0 : 0

               10 =     01010
              -10 =     10110
              10^(-10) =11100 =-4 = -ve
     */

    public static boolean areOppositeSign(int n1, int n2){

        return (n1^n2) <0;
    }

    public static void main(String[] args) {
        System.out.println(areOppositeSign(10, -10));
        System.out.println(areOppositeSign(2,4));
        System.out.println(areOppositeSign(0,0));
    }
}
