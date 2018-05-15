package javamodules.concurrent.examples;


public class OddEvenInSeparateThreads {

    private int num =0;
    private static final int MAX_VALUE = 100;
    private boolean isOdd = false;

    public synchronized void printOdd() throws InterruptedException {

        while(num<MAX_VALUE){

            while(!isOdd){
                wait();
            }
            System.out.println(Thread.currentThread().getName()+"----"+num);
            Thread.sleep(500);
            num++;
            isOdd=false;
            notify();

        }

    }

    public synchronized void printEven() throws InterruptedException {

        while (num<MAX_VALUE){

            while(isOdd){
                wait();
            }
            System.out.println(Thread.currentThread().getName()+"----"+num);
            Thread.sleep(500);
            num++;
            isOdd=true;
            notify();


        }

    }

    public static void main(String[] args) {

        OddEvenInSeparateThreads oddEvenInSeparateThreads = new OddEvenInSeparateThreads();
        Runnable runnable = ()-> {
            try {
                oddEvenInSeparateThreads.printOdd();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Runnable runnable1 = () -> {
            try {
                oddEvenInSeparateThreads.printEven();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        };
        Thread t1 = new Thread(runnable, "Odd Thread");
        Thread t2 = new Thread(runnable1, "Even Thread");
        t1.start();
        t2.start();

    }

}
