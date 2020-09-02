package csFundamentals.binary;

public class DecimalToBinary {
    /*
    2|10 0
    2|5  1
    2|2  0
     |1  1 */

    public static void printDecimalToBinary(int number){

        if(number>1)
            printDecimalToBinary(number/2);
        System.out.print(number%2);

    }

    public static void main(String[] args) {
        printDecimalToBinary(10);
        System.out.println();
        printDecimalToBinary(0);
        System.out.println();
        printDecimalToBinary(1);
        System.out.println();
        printDecimalToBinary(652397537);
    }

}
