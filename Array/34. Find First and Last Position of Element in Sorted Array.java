class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;        
        int[] result = {-1, -1};
        while(left <= right){
            int mid = left + (right - left) / 2;
            int midNum = nums[mid];
            if(target == midNum){
                result[0] = mid;
                result[1] = mid;
                while(result[0] > 0 && nums[result[0] - 1] == midNum){
                    result[0] --;
                }
                while(result[1] < nums.length - 1 && nums[result[1] + 1] == midNum){
                    result[1] ++;
                }
                break;
            }
            if(target < midNum){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return result;
    }
}
