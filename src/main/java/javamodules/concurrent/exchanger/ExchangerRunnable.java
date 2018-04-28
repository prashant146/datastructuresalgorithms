package javamodules.concurrent.exchanger;

import java.util.concurrent.Exchanger;

public class ExchangerRunnable implements Runnable {

    private Exchanger exchanger = null;
    private Object object = null;

    public ExchangerRunnable(Exchanger exchanger, Object object){
        this.exchanger = exchanger;
        this.object = object;
    }

    @Override
    public void run() {

        try {
            Object previous = this.object;
            Object newObject = this.exchanger.exchange(this.object);

            System.out.format("Thread: %s exchanged: %s to: %s", Thread.currentThread().getName(), previous, newObject);
            System.out.println();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
