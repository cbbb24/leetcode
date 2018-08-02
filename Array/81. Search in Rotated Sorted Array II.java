class Solution {
    public boolean search(int[] nums, int target) {
        if(nums.length == 0) return false;
        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            int midNum = nums[mid];
            if(target == midNum) return true;
            if(nums[left] < midNum){
                if(target < midNum && target >= nums[left])
                    right = mid - 1;
                else
                    left = mid + 1;
            }else if(nums[left] > midNum){
                if(target > midNum && target <= nums[right])
                    left = mid + 1;
                else
                    right = mid - 1;
            }else
                left++;
        }
        return false;
    }
}
