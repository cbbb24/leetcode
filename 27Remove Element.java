class Solution {
    public int removeElement(int[] nums, int val) {
        int tmp;
        int l = 0;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == val){
                l++;
                nums[i] = nums[nums.length - l];
            }
        }
        return nums.length - l;
    }
}
