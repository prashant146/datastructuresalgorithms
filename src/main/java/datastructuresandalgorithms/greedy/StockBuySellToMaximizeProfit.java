package datastructuresandalgorithms.greedy;

import java.util.ArrayList;
import java.util.List;

public class StockBuySellToMaximizeProfit {


    public static void main(String[] args) {
        int price[] = {7,6,4,3,1};
        StockBuySellToMaximizeProfit stockBuySellToMaximizeProfit = new StockBuySellToMaximizeProfit();
        System.out.println(stockBuySellToMaximizeProfit.getBuySellDays(price));
    }

    /**Case1:  int price[] = { 100, 180, 260, 310, 40, 535, 695 };
     *         Buy on day : 0   Sell on day: 3
               Buy on day : 4   Sell on day: 6
     *
     *
     * @param prices
     */
    public int getBuySellDays(int[] prices){

        if(prices==null || prices!=null && prices.length<=1){
            return 0;
        }

        int i=0;
        List<Price> priceList = new ArrayList<>();
        while(i<prices.length){

            while(i<prices.length-1 && prices[i]>=prices[i+1]){
                i++;
            }

            Price price = new Price();
            price.buy = i;
            i++;

            while(i<prices.length && prices[i-1]<prices[i]){
                i++;
            }

            price.sell=i-1;
            priceList.add(price);
        }

        int profit =0;

        for(Price price : priceList){
            profit = profit + (prices[price.sell] - prices[price.buy]);
        }

        return profit;
    }

    static class Price{
        int buy;
        int sell;

        public int getBuy() {
            return buy;
        }

        public void setBuy(int buy) {
            this.buy = buy;
        }

        public int getSell() {
            return sell;
        }

        public void setSell(int sell) {
            this.sell = sell;
        }
    }

}
