public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int buy = 0, sell = 0, mp = 0;
        if (prices.length == 1)
            return 0;
        if (prices.length == 2) {
            // return Math.max(prices[0],prices[1])-Math.min(prices[0],prices[1]);
            if (prices[0] >= prices[1])
                return 0;
            else
                return prices[1] - prices[0];
        }
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {

                // if(prices[i]>max)
                // max=prices[i];
                // else if(prices[i]<min)
                // min=prices[i];
                if ((prices[j] - prices[i]) > mp) {
                    buy = prices[i];
                    sell = prices[j];
                    mp = (sell - buy);
                }
            }
        }
        // p=max-min;
        return mp;
    }

}
