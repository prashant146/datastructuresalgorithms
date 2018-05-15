package javamodules.concurrent.examples;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

    private BlockingQueue<Integer> blockingQueue;
    private Integer poisonpill;

    public Producer(BlockingQueue<Integer> blockingQueue, Integer poisonpill){
        this.blockingQueue=blockingQueue;
        this.poisonpill=poisonpill;
    }

    @Override
    public void run() {

        for(int i=0; i<100; i++){
            System.out.println("Adding into blockingQueue value: "+i);
            try {
                blockingQueue.put(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        blockingQueue.add(poisonpill);

    }
}
