class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length < 2)
            return nums.length;
        int n = 0;
        for(int num : nums){
            if(num != nums[n]){
                n++;
                nums[n] = num;
            }
        }
        return n + 1;
    }
}
