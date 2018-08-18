class Solution {
    public int findKthLargest(int[] nums, int k) {
        sort(nums, 0, nums.length - 1);
        return nums[nums.length - k];
    }
    public void sort(int[] nums, int left, int right){
        if(left >= right) return;
        int i = left;
        int j = right;
        int flag = nums[i];
        while(i < j){
            while(i < j && nums[j] > flag)
                j--;
            while(i < j && nums[i] <= flag)
                i++;
            if(i < j){
                int temp1 = nums[i];
                nums[i] = nums[j];
                nums[j] = temp1;
            }
        }
        int temp2 = nums[i];
        nums[i] = nums[left];
        nums[left] = temp2;
        sort(nums, left, i - 1);
        sort(nums, i + 1, right);        
    }
}
