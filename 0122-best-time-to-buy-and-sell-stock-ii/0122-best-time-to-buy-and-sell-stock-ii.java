class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int buy = prices[0];
        int max = 0;
        
        for(int i=1;i<prices.length;i++){
            if(prices[i] < buy){
                if(max!=0){
                    profit+=max-buy;
                    max=0;
                }
                buy = prices[i];
            }
            else if(prices[i] > max && prices[i] > buy){
                max = prices[i];
            }
            else{
                if(max!=0){
                profit+=max-buy;}
                buy = prices[i];
                max = 0;
            }
        }
        if(max!=0){
            profit+=max-buy;
        }
        return profit;
    }
}