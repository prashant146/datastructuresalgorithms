package javamodules.concurrent.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class Solution {

    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(3);

        Waiter waiter = new Waiter(countDownLatch);
        Decrementor decrementor = new Decrementor(countDownLatch);

        Thread t1 = new Thread(waiter);
        Thread t2 = new Thread(decrementor);

        t1.start();
        t2.start();

    }
}
