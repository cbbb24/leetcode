class Solution {
    public void sortColors(int[] nums) {
        int count0 = 0, count1 = 0, count2 = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0) count0++;
            if(nums[i] == 1) count1++;
            if(nums[i] == 2) count2++;
        }
        for(int i = 0; i < nums.length; i++){
            if(count0 != 0){
                nums[i] = 0;
                count0--;
            }else if(count1 != 0){
                nums[i] = 1;
                count1--;
            }else if(count2 != 0){
                nums[i] = 2;
                count2--;
            }
            
        }
    }
}
