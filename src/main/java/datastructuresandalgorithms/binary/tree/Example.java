package datastructuresandalgorithms.binary.tree;


import java.io.IOException;

public class Example {

    public static void main(String[] args) throws IOException{

        m1();
        System.out.println(m2());
    }

    public static int m2(){
        try{
            return 1;
        }catch (Exception e){
            return 2;
        }finally {
            return 3;
        }
    }

    public static synchronized void m3(){

    }

    public static void m1() throws IOException{
        try{
            System.out.println("In try");
            Thread.sleep(2000);
            throw new IOException("In try");
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("In catch");
            Thread.sleep(2000);
            throw new IOException("In catch");
        }finally{
            System.out.println("In finally");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            throw new IOException("In finally block exception");
        }
    }


}
