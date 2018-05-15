package javamodules.concurrent.examples;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {

    private BlockingQueue<Integer> blockingQueue;
    private Integer poisonpill;

    public Consumer(BlockingQueue<Integer> blockingQueue, Integer poisonpill){
        this.blockingQueue=blockingQueue;
        this.poisonpill=poisonpill;
    }

    @Override
    public void run() {

        while(true){
            Integer integer = null;
            try {
                integer = blockingQueue.take();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(integer.equals(poisonpill)){
                return;
            }
            System.out.println(Thread.currentThread().getName()+" polling from queue: "+integer);
        }
    }
}
