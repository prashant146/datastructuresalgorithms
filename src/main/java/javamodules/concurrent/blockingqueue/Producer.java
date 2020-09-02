package javamodules.concurrent.blockingqueue;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{

    private BlockingQueue<Integer> blockingQueue;

    public Producer(BlockingQueue<Integer> blockingQueue){
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        try {
            for(int i=1; i<100000; i++){
                blockingQueue.put(i);
                System.out.println("Peeking in bq in Producer: "+blockingQueue.peek());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
