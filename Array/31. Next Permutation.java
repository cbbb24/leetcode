class Solution {
    public void nextPermutation(int[] nums) {
        int pos = nums.length - 1;
        while(pos > 0 && nums[pos] <= nums[pos - 1])
            pos--;
        if(pos == 0)
            Arrays.sort(nums);
        else if(pos == nums.length - 1){
            int temp = nums[pos];
            nums[pos] = nums[pos - 1];
            nums[pos - 1] = temp;
        }else{
            int end = nums.length - 1;
            while(end > pos && nums[end] <= nums[pos - 1])
                end--;
            int temp2 = nums[end];
            nums[end] = nums[pos - 1];
            nums[pos - 1] = temp2;
            Arrays.sort(nums, pos, nums.length);
        }
        
    }
}
