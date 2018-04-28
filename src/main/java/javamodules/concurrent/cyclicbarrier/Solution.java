package javamodules.concurrent.cyclicbarrier;

import java.util.concurrent.CyclicBarrier;

public class Solution {

    public static void main(String[] args) {

        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Barrier 1 finished");
            }
        };

        Runnable runnable2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Barrier 2 finished");
            }
        };

        CyclicBarrier cyclicBarrier = new CyclicBarrier(2, runnable1);
        CyclicBarrier cyclicBarrier1 = new CyclicBarrier(2, runnable2);
        Thread t1 = new Thread(new CyclicBarrierRunnable(cyclicBarrier, cyclicBarrier1));
        Thread t2 = new Thread(new CyclicBarrierRunnable(cyclicBarrier, cyclicBarrier1));

        t1.start();t2.start();


    }



}
