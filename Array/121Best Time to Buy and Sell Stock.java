class Solution {
/**    public int maxProfit(int[] prices) {
        int max = 0;
        for(int i = 0; i < prices.length; i++){
            for(int j = i; j < prices.length; j++){
                if(prices[j] - prices[i] > 0){
                    max = Math.max(max, prices[j] - prices[i]);
                }else{
                    continue;
                }
            }
        }
        return max;
    }
*/
      public int maxProfit(int[] prices) {
         int min = Integer.MAX_VALUE;
         int max = 0; 
         for(int i = 0; i < prices.length; i++){
             if(prices[i] < min){
                 min = prices[i];
             }
             if(prices[i] - min > max){
                 max = prices[i] - min;
             } 
         }
          return max;
    }
}
