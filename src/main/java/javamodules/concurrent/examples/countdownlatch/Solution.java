package javamodules.concurrent.examples.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class Solution {

    public static void main(String[] args) {

        CountDownLatch countDownLatch = new CountDownLatch(3);
        new Thread(new Waiter(countDownLatch)).start();
        new Thread(new Decrementor(countDownLatch)).start();
    }
}
