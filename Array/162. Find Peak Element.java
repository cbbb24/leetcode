class Solution {
    public int findPeakElement(int[] nums) {
        return helper(0, nums.length - 1, nums);
    }
    public int helper(int start, int end, int[] nums){
        if(start == end) return start;
        if(start + 1 == end){
            if(nums[start] < nums[end])
                return end;
            else
                return start;
        }
        int mid = start + (end - start) / 2;
        if(nums[mid] > nums[mid + 1] && nums[mid] > nums[mid - 1]){
            return mid;
        }else if(nums[mid] > nums[mid - 1] && nums[mid] < nums[mid + 1]){
            return helper(mid + 1, end, nums);
        }else
            return helper(start, mid - 1, nums);
    }
}
