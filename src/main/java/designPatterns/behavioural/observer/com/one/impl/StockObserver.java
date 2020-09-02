package designPatterns.behavioural.observer.com.one.impl;

import designPatterns.behavioural.observer.com.one.Observer;
import designPatterns.behavioural.observer.com.one.Subject;

public class StockObserver implements Observer {

    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;
    private static int observerIDTracker = 0;
    private int observerID;
    private Subject stockGrabber;

    public StockObserver(Subject stockGrabber){
        this.stockGrabber = stockGrabber;
        this.observerID = ++observerIDTracker;
        System.out.println("New Observer " + this.observerID);
        stockGrabber.register(this);
    }

    @Override
    public void update(double ibm, double apple, double yahoo) {
        this.ibmPrice = ibm;
        this.aaplPrice = apple;
        this.googPrice = yahoo;
        printThePrices();
    }


    public void printThePrices(){

        System.out.println(observerID + "\nIBM: " + ibmPrice + "\nAAPL: " +

                aaplPrice + "\nGOOG: " + googPrice + "\n");
    }

}
