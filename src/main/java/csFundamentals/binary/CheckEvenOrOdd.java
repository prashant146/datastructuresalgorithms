package csFundamentals.binary;

public class CheckEvenOrOdd {

    //eg 10:  1010 & 0001 = 0000 ==0 even
    // 11:    1011 & 0001 = 0001 ==1 odd


    public static boolean isEvenNumber(int num){

        return (num & 1)==0;

    }

    public static void main(String[] args) {

        System.out.println(isEvenNumber(10));
        System.out.println(isEvenNumber(11));
        System.out.println(isEvenNumber(2));
        System.out.println(isEvenNumber(0));
        System.out.println(isEvenNumber(999));
    }



}
