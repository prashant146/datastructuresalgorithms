package javamodules;

public class Solution {


    public void method1(int a, int b){

        System.out.println("inside method 1");
        method2(a, b);
    }

    public void method2(int a, int b){
        System.out.println("inside method 2");
        method3(a, b);
    }

    public void method3(int a , int b){
        System.out.println("inside method 3");
        try{
            System.out.println(a/b);
        }catch (ArithmeticException e) {
            System.out.println("caught Arithmatic exception" + a + b);
            e.getMessage();
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.method1(1,0);
    }



}
