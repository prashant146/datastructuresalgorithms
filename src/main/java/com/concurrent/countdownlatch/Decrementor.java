package com.concurrent.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class Decrementor implements Runnable {

    private CountDownLatch countDownLatch;

    public Decrementor(CountDownLatch countDownLatch){
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {

        try {
            Thread.sleep(3000);
            countDownLatch.countDown();
            System.out.println("Decreased by 1");

            Thread.sleep(3000);
            countDownLatch.countDown();
            System.out.println("Decreased by 2");

            Thread.sleep(3000);
            countDownLatch.countDown();
            System.out.println("Decreased by 3");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
