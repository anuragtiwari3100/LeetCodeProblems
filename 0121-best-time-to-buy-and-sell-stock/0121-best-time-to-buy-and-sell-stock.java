class Solution {
    public int maxProfit(int[] arr) {
        int buyPrice = Integer.MAX_VALUE;
        int maxPrice =0;
        int maxProiopofit = 0;
        int profit = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(buyPrice < arr[i]){
                 profit = arr[i] - buyPrice;
maxProiopofit = Math.max(profit,maxProiopofit);
            }else{
             buyPrice = arr[i];
            }
        }
        return maxProiopofit;
    }
}