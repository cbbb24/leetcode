class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int result = 0;
        for(int i = 0; i < nums.length; i++){
            result = result < 0 ? nums[i] : nums[i] + result;
            max = Math.max(max, result);
        }
        return max;
    }
}
