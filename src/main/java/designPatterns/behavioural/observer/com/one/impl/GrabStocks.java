package designPatterns.behavioural.observer.com.one.impl;


public class GrabStocks {

    public static void main(String[] args){

        StockGrabber stockGrabber = new StockGrabber();

        stockGrabber.setIBMPrice(197.00);
        stockGrabber.setApplePrice(677.60);
        stockGrabber.setYahooPrice(676.40);

        stockGrabber.setIBMPrice(197.00);
        stockGrabber.setApplePrice(677.60);
        stockGrabber.setYahooPrice(676.40);

        stockGrabber.setIBMPrice(197.00);
        stockGrabber.setApplePrice(677.60);
        stockGrabber.setYahooPrice(676.40);

        Runnable getIBM = new GetTheStock(stockGrabber,  "IBM", 197.00);
        Runnable getAAPL = new GetTheStock(stockGrabber,  "APPLE", 677.60);
        Runnable getGOOG = new GetTheStock(stockGrabber, "YAHOO", 676.40);

        Thread t1 = new Thread(getIBM);
        t1.setName("Thread1");
        t1.start();

        Thread t2 = new Thread(getAAPL);
        t2.setName("Thread2");
        t2.start();

        Thread t3 = new Thread(getGOOG);
        t3.setName("Thread3");
        t3.start();

    }

}
