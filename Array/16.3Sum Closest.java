class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int result = Integer.MAX_VALUE;
        int cha = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length - 2; i++){
            int start = i + 1;
            int end = nums.length - 1;
            while(start < end){
                int sum = nums[i] + nums[start] + nums[end];
                if(Math.abs(sum - target) < cha){
                    cha = Math.abs(sum - target);
                    result = sum;
                    if(cha == 0) return result;
                }
                if(sum < target)
                    start++;
                else
                    end--;                
            }
        }
        return result;
    }
}
