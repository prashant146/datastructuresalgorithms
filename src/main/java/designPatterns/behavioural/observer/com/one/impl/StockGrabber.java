package designPatterns.behavioural.observer.com.one.impl;

import designPatterns.behavioural.observer.com.one.Observer;
import designPatterns.behavioural.observer.com.one.Subject;

import java.util.ArrayList;
import java.util.List;

public class StockGrabber implements Subject {

    private List<Observer> observers;
    private double apple;
    private double ibm;
    private double yahoo;

    public StockGrabber(){
        observers = new ArrayList<>();
    }


    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unRegister(Observer observer) {
        System.out.println("removing observer: ");
        observers.remove(observers.indexOf(observer));
    }

    @Override
    public void notifyObserver() {
        for(Observer observer : observers){
            observer.update(ibm, apple, yahoo);
        }
    }

    public void setIBMPrice(double newIBMPrice){
        this.ibm = newIBMPrice;
        notifyObserver();
    }
    public void setApplePrice(double newApplerice){
        this.apple = newApplerice;
        notifyObserver();
    }
    public void setYahooPrice(double newYahooPrice){
        this.yahoo = newYahooPrice;
        notifyObserver();
    }

}
