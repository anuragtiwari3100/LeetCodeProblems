class Solution {
    public int maxProfit(int[] prices) {
         int bestBuy =  prices[0];
         int maxprofit = 0;
         int currprofit = 0;
         for(int i=1; i<prices.length; i++){
            if(bestBuy<prices[i]){
                currprofit = prices[i] - bestBuy;
                maxprofit = Math.max(maxprofit,currprofit);
            }else{
           bestBuy  = Math.min(bestBuy,prices[i]);
            }
         }
         return maxprofit;
    }
}