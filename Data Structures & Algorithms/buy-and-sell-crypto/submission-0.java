class Solution {
    public int maxProfit(int[] prices) {
       int maxProfit = 0;
       int left = 0;
       int right = left + 1;
       while(right < prices.length){
            int buy = prices[left];
            int sell = prices[right];
            if(buy > sell){
                left = right;
                right = left + 1;
            } else {
                int profit = sell - buy;
                right++;
                maxProfit = Math.max(maxProfit, profit);
            }
       }
       return maxProfit;
    }
}
