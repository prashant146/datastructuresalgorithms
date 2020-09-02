package datastructuresandalgorithms.greedy;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class StockBuySellToMaximizeProfitTest {

    private StockBuySellToMaximizeProfit stockBuySellToMaximizeProfit = new StockBuySellToMaximizeProfit();

    @Test
    public void testGetBuySellDays(){
        int price[] = { 100, 180, 260, 310, 40, 535, 695 };
        StockBuySellToMaximizeProfit.Price price1 = new StockBuySellToMaximizeProfit.Price();
        List<StockBuySellToMaximizeProfit.Price> priceList = new ArrayList<>();
        //priceList = stockBuySellToMaximizeProfit.getBuySellDays(price);
        //Assert.assertTrue(!priceList.isEmpty());
        //for(StockBuySellToMaximizeProfit.Price price2 : priceList){
            //System.out.println("Buy at:"+price2.buy+" and Sell at:"+price2.sell);
        //}
    }

}
