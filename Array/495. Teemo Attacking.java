class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int sum = 0;
        if(timeSeries == null || timeSeries.length == 0) return 0;
        if(timeSeries.length == 1) return duration;
        for(int i = 0; i < timeSeries.length - 1; i++){
            if(timeSeries[i] + duration > timeSeries[i + 1]){
                sum += timeSeries[i + 1] - timeSeries[i];
            }else{
                sum += duration;
            }
        }
        sum += duration;
        return sum;
    }
}
