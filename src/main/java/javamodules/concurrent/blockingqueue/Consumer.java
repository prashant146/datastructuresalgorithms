package javamodules.concurrent.blockingqueue;


import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {

    private BlockingQueue<Integer> blockingQueue;

    public Consumer(BlockingQueue<Integer> blockingQueue){
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {

        try {
            for(int i=0 ;i < 100000; i++){
                if(!blockingQueue.isEmpty()){
                    System.out.println("Removed in consumer from bq : "+blockingQueue.take());
                }

            }


        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
