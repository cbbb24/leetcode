class Solution {
    public void moveZeroes(int[] nums) {
        if(nums == null || nums.length == 0)
            return;
        int flag = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[flag] = nums[i];
                flag++;
            }
        }
        for(int j = flag; j < nums.length; j++){
            nums[j] = 0;
        }
    }
}
