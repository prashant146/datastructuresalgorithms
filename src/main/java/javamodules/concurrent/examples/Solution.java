package javamodules.concurrent.examples;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Solution {

    public static void main(String[] args) {

        BlockingQueue<Integer> blockingQueue = new LinkedBlockingQueue<>();
        Integer poisonPill = Integer.MAX_VALUE;

        for(int i=0 ;i<4; i++){
            new Thread(new Producer(blockingQueue, poisonPill)).start();
        }
        for(int i =0; i<4; i++){
            new Thread(new Consumer(blockingQueue, poisonPill)).start();
        }

    }
}
