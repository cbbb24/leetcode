class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for(int i = nums.length - 1; i >= 2; i--){
            int l = 0;
            int r = i - 1;
            while(l < r){
                if(nums[l] + nums[r] > nums[i]){
                    sum += r - l;
                    r--;
                }else
                    l++;
            }
        }
        return sum;
    }
}
