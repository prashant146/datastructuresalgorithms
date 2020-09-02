package csFundamentals.binary;

public class Example1 {

    //Multiply a given integer with 3.5
    //3.5x = x+ x/2 + 2x
    // x+ x>>1 + x<<1

    public static int getResult(int number){

        return number+(number>>1) +(number<<1);

    }

    public static void main(String[] args) {
        System.out.println(getResult(2));
        System.out.println(getResult(0));
        System.out.println(getResult(-1));
        System.out.println(getResult(10));
    }
}
