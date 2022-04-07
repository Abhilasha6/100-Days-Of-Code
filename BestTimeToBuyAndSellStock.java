public class BestTimeToBuyAndSellStock {

//Brute force approach- works perfect but time limit may exceed for very large data
    public int maxProfit(int[] prices) {
        int buy = 0, sell = 0, mp = 0;
        if (prices.length == 1)
            return 0;
        if (prices.length == 2) {
            if (prices[0] >= prices[1])
                return 0;
            else
                return prices[1] - prices[0];
        }
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if ((prices[j] - prices[i]) > mp) {
                    buy = prices[i];
                    sell = prices[j];
                    mp = (sell - buy);
                }
            }
        }
        return mp;
    }


//optimised solution that works for huge input data as well
public int maxProfit1(int[] prices) {
    int profit = 0;
    int buy = 0; // index when buying
    for(int i=0;i<prices.length;i++){
        if(prices[buy] > prices[i]) buy = i;
        profit = Math.max(profit, prices[i] - prices[buy]);
    }
    return profit;
}

}
