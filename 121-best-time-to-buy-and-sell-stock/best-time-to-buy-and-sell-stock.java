class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minValue = prices[0];

        for(int i = 1; i < prices.length; i++) {
            maxProfit = Math.max(maxProfit, prices[i]-minValue);
            minValue = Math.min(minValue, prices[i]);
        }
        return maxProfit;
    }
}

// choose smallest # on left, biggest # on right