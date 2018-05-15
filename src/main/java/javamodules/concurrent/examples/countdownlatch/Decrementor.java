package javamodules.concurrent.examples.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class Decrementor implements Runnable {

    private CountDownLatch countDownLatch;

    public Decrementor(CountDownLatch countDownLatch){
        this.countDownLatch=countDownLatch;
    }

    @Override
    public void run(){

        try {
            System.out.println("Finishing task 1: Waiter thread should wait");
            Thread.sleep(2000);
            this.countDownLatch.countDown();

            System.out.println("Finishing task 2: Waiter thread should wait");
            Thread.sleep(3000);
            this.countDownLatch.countDown();

            System.out.println("Finishing task 3: Waiter thread should wait");
            Thread.sleep(3000);
            this.countDownLatch.countDown();

            System.out.println("All tasks finished: Waiter thread can start executing");


        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
