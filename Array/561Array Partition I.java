class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for(int n=0; n < nums.length; n = n + 2){
            sum += nums[n];
        }
        return sum;
    }
}
