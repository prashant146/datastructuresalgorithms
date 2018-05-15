package javamodules.concurrent.cyclicbarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierRunnable implements Runnable {

    CyclicBarrier cyclicBarrier1 = null;
    CyclicBarrier cyclicBarrier2 = null;

    public CyclicBarrierRunnable(CyclicBarrier c1, CyclicBarrier c2){
        this.cyclicBarrier1=c1;
        this.cyclicBarrier2=c2;
    }


    @Override
    public void run() {
        try {
            Thread.sleep(3000);
            System.out.println("Thread: "+Thread.currentThread().getName()+ " waiting at barrier 1");
            cyclicBarrier1.await();

            System.out.println("Continuing after first barrier");

            Thread.sleep(3000);
            System.out.println("Thread: "+Thread.currentThread().getName()+ " waiting at barrier 2");
            cyclicBarrier2.await();


        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }

    }
}
