class Solution {
    public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1, min = 0;
        if(nums.length == 1 || nums[left] < nums[right]) return nums[left];
        while(left <= right){
            int mid = left + (right - left) / 2;
            int midNum = nums[mid];
            if(mid >= 1 && midNum < nums[mid - 1]){
                min = midNum;
                break;
            }
            if(mid <= nums.length - 2 && midNum > nums[mid + 1]){
                min = nums[mid + 1];
                break;
            }
            if(midNum >= nums[left]){
                left = mid + 1;
            }else 
                right = mid - 1;            
        }
        return min;
    }
}
