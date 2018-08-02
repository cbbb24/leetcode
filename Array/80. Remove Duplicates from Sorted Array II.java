class Solution {
    public int removeDuplicates(int[] nums) {
/**
        if(nums.length <= 2) return nums.length;
        int n = 2;
        for(int i = 2; i < nums.length; i++){
            if(nums[i] > nums[n - 2]){
                nums[n++] = nums[i];
            }
        }
        return n;
*/
        int k = 2;
        if(nums.length <= k) return nums.length;
        int i = 1;
        int j = 1;
        int count = 1;
        while(j < nums.length){
            if(nums[j] != nums[j - 1]){
                nums[i++] = nums[j];
                count = 1;
            }else if(count < k){
                nums[i++] = nums[j];
                count++;
            }
            j++;
        }
        return i;
    }
}
