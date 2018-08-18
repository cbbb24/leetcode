class Solution {
    public int rob(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];
        return Math.max(dp(nums, 0, nums.length - 2), dp(nums, 1, nums.length - 1));
    }
    public int dp(int[] nums, int lo, int hi){
        if(lo == hi) return nums[lo];
        int[] res = new int[hi - lo + 1];
        res[0] = nums[lo];
        res[1] = Math.max(nums[lo], nums[lo + 1]);
        for(int i = lo + 2; i <= hi; i++){
            res[i - lo] = Math.max(res[i - lo - 1], res[i - lo - 2] + nums[i]); 
        }
        return res[res.length - 1];
    }
}
