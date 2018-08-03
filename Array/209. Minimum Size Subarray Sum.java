class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        int num = Integer.MAX_VALUE;
        int start = 0;
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            while(sum >= s){
                num = Math.min(num, i - start + 1);
                sum -= nums[start++];
            }
        }
        return num == Integer.MAX_VALUE ? 0 : num;
    }
}
