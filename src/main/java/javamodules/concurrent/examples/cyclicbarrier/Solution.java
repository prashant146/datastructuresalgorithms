package javamodules.concurrent.examples.cyclicbarrier;

import java.util.concurrent.CyclicBarrier;

public class Solution {

    public static void main(String[] args) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Executed cyclic barrier");
            }
        };

        CyclicBarrier cyclicBarrier = new CyclicBarrier(3, runnable);
        new Thread(new CyclicBarrierRunnable(cyclicBarrier), "Thread1").start();
        new Thread(new CyclicBarrierRunnable(cyclicBarrier), "Thread2").start();
        new Thread(new CyclicBarrierRunnable(cyclicBarrier), "Thread3").start();


    }
}
