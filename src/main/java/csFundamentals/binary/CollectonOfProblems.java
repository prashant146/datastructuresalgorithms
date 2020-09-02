package csFundamentals.binary;

public class CollectonOfProblems {

    /* 10: 1010: 2 1's
       15: 1111: 4 1's
    *
    * */

    public static void main(String[] args) {
        System.out.println(getSetBitsInGivenNumber(10));
        System.out.println(getSetBitsInGivenNumber(15));
        System.out.println("Calling recursive method");
        System.out.println(getSetBitsInGivenNumberRec(31));
        System.out.println(getSetBitsInGivenNumberRec(15));
        countBitsToFlipToConvertNum1ToNum2(10,20);
        System.out.println("isAPowerOf2 10:"+isAPowerOf2(10));
        System.out.println("isAPowerOf2 4:"+isAPowerOf2(4));
        System.out.println("isAPowerOf2 32:"+isAPowerOf2(32));
        System.out.println("isAPowerOf2 31:"+isAPowerOf2(31));
        System.out.println("isAPowerOf2 100:"+isAPowerOf2(100));
        System.out.println("isAPowerOf2 0:"+isAPowerOf2(0));
        System.out.println("isAPowerOf2 1:"+isAPowerOf2(1));
        System.out.println("multiply by 7: number 10:"+multiplyBy7(10));
        System.out.println("multiply by 7: number -5:"+multiplyBy7(-5));
        System.out.println("multiply by 7: number 100:"+multiplyBy7(100));
        System.out.println("multiply by 7: number 0:"+multiplyBy7(0));
        System.out.println(getPositionOfRightMostSetBit(32));
        swapTwoNumbers(10, 13);
    }

    public static int getSetBitsInGivenNumber(int num){

        int count =0;
        while (num>0){
            count+=num&1;
            num=num>>1;
        }

        return count;

    }

    public static int getSetBitsInGivenNumberRec(int number){
        if(number==0){
            return 0;
        }

        return (number&1) + getSetBitsInGivenNumber(number>>1);
    }

    public static void countBitsToFlipToConvertNum1ToNum2(int number1, int number2){

        int num = number1^number2;
        System.out.println("Bits to filp to convert number1:"+number1+" to number2:"+number2+" " +
                "are:"+getSetBitsInGivenNumberRec(num));

    }

    public static boolean isAPowerOf2(int number){

        return 1==getSetBitsInGivenNumberRec(number);
    }

    public static int multiplyBy7(int number){
        int temp = number;
        return (number<<3)-temp;
    }

    public static int getPositionOfRightMostSetBit(int number){
        if(number==0){
            return -1;
        }
        int count =1;
        while(true){
            if((number&1)==1){
                return count;
            }else {
                count++;
                number=number>>1;
            }
        }
    }

    public static void swapTwoNumbers(int number1, int number2){

        System.out.println("Before swapping number1:"+number1+", number2:"+number2);
        number1=number1^number2;
        number2=number1^number2;
        number1=number1^number2;

        System.out.println("After swapping number1:"+number1+", number2:"+number2);

    }

}
