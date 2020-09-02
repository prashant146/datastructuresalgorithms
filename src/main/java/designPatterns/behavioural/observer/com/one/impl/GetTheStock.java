package designPatterns.behavioural.observer.com.one.impl;

import designPatterns.behavioural.observer.com.one.Subject;

import java.text.DecimalFormat;

public class GetTheStock implements Runnable{

    private String stock;
    private double price;
    private Subject stockGrabber;

    public GetTheStock(Subject stockGrabber, String newStock, double newPrice){

        this.stockGrabber = stockGrabber;
        stock = newStock;
        price = newPrice;
    }

    public void run(){

        for(int i = 1; i <= 20; i++){

            try{

                Thread.sleep(2000);

            }
            catch(InterruptedException e)
            {}
            double randNum = (Math.random() * (.06)) - .03;

            DecimalFormat df = new DecimalFormat("#.##");
            price = Double.valueOf(df.format((price + randNum)));

            if(stock == "IBM") ((StockGrabber) stockGrabber).setIBMPrice(price);
            if(stock == "AAPL") ((StockGrabber) stockGrabber).setApplePrice(price);
            if(stock == "GOOG") ((StockGrabber) stockGrabber).setYahooPrice(price);
            System.out.println(Thread.currentThread().getName()+"---"+stock + ": " + df.format((price + randNum)) +
                    " " + df.format(randNum));

            System.out.println();
        }
    }

}
