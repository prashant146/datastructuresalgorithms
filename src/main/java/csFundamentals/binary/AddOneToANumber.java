package csFundamentals.binary;

public class AddOneToANumber {

    // -A = ~A +1 -- 2's complement
    // A+1 = -(~A)

    public static int getNumberPlusOne(int number){
        return -(~number);
    }

    public static void main(String[] args) {

        System.out.println(getNumberPlusOne(2));
        System.out.println(getNumberPlusOne(-1));
        System.out.println(getNumberPlusOne(0));
        System.out.println(10>>1);

    }

}
