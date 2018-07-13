class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0 || prices.length == 1)
            return 0;
        int min = prices[0];
        int max = 0;
        int sum = 0;
        for(int i = 1; i < prices.length; i++){
            if(prices[i] < prices[i - 1]){
                min = prices[i];
                sum += max;
                max = 0;
            }
            if(prices[i] - min > max){
                max = prices[i] - min;
            }
        }
        return sum + max;
    }
}
