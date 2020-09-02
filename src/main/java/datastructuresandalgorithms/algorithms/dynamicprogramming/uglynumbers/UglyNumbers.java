package datastructuresandalgorithms.algorithms.dynamicprogramming.uglynumbers;

public class UglyNumbers {

    private static int m1(int a, int b){
        while(a%b==0){
            a = a/b;
        }
        return a;
    }

    private static boolean isUglyNumber(int number){
        int output =m1(number,2);
        output=m1(output,3);
        output=m1(output,5);

        return output==1;

    }

    private static int getNthUglyNumber(int number){
        int i =1;
        int output = 1;
        while(output<number){
            i++;
            if(isUglyNumber(i)){
                System.out.println(i+" is ugly number");
                output++;
            }
        }
        return i;
    }


    public static void main(String[] args) {
        System.out.println(getNthUglyNumber(11));
    }


}
