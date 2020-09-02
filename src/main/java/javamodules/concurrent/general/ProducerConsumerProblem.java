package javamodules.concurrent.general;


import java.util.ArrayList;
import java.util.List;

public class ProducerConsumerProblem {

    private List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {

        ProducerConsumerProblem producerConsumerProblem = new ProducerConsumerProblem();

        Runnable runnable0 = ()->{
            try {
                for(int i=0; i<101; i++){
                    producerConsumerProblem.producer(i);
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Runnable runnable1 = ()->{
            producerConsumerProblem.consumer(100);
        };

        Thread t1 = new Thread(runnable0);
        Thread t2 = new Thread(runnable1);
        t1.start();
        t2.start();

    }

    private void producer(Integer i) throws InterruptedException{

        synchronized (this){
            while(!list.isEmpty()){
                wait();
            }
            list.add(i);
            System.out.println("Produced value:"+i);
            notify();
        }



    }

    private void consumer(int poisonPill){
        synchronized (this){
            while(true){
                while(list.isEmpty()){
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                Integer removedValue = list.remove(list.size()-1);
                System.out.println("Consumed value:"+removedValue);
                notify();
                if(removedValue==poisonPill){
                    System.out.println("Poison Pill received. Breaking code");
                    return;
                }
            }

        }

    }
}
