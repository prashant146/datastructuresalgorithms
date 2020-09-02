package javamodules.concurrent.general;

public class DeadLock {

    private String str1 = "Hello";
    private String str2 = "World";

    public static void main(String[] args) {
        DeadLock deadLock = new DeadLock();
        Runnable runnable1 = ()->{
            deadLock.method1();
        };

        Runnable runnable2 = ()->{
            deadLock.method2();;
        };

        Thread t1 = new Thread(runnable1);
        Thread t2 = new Thread(runnable2);

        t1.start();
        t2.start();
    }

    private void method1(){
        synchronized (str1){
            System.out.println("Taken lock on str1 from method1");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (str2){
                System.out.println("Taken lock on str2 from method1");
            }
        }
    }

    private void method2(){
        synchronized (str2){
            System.out.println("Taken lock on str2 from method2");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (str1){
                System.out.println("Taken lock on str1 from method12");
            }
        }
    }

}
