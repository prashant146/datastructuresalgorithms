package javamodules.concurrent.general;

public class Solution {

    public static void main(String[] args) {

        for(int i=0; i<10; i++){

            new Thread(" "+i){
                public void run(){
                    System.out.println(Thread.currentThread().getName()+" is running");
                }

            }.start();

        }

    }

}
