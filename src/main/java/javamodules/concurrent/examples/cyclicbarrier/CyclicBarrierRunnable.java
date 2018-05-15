package javamodules.concurrent.examples.cyclicbarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierRunnable implements Runnable {

    private CyclicBarrier cyclicBarrier;

    public CyclicBarrierRunnable(CyclicBarrier cyclicBarrier){
        this.cyclicBarrier = cyclicBarrier;
    }

    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName()+" entered runnable");

        try {
            Thread.sleep(2000);
            cyclicBarrier.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }

        System.out.println("Barrier finally over");

    }
}
