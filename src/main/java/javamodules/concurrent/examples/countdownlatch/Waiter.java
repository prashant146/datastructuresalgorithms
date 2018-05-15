package javamodules.concurrent.examples.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class Waiter implements Runnable {

    private CountDownLatch countDownLatch;

    public Waiter(CountDownLatch countDownLatch){
        this.countDownLatch=countDownLatch;
    }

    @Override
    public void run() {

        try {
            countDownLatch.await();
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Waiter thread started execution");

    }
}
