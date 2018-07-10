class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < nums.length; i++){
            nums[Math.abs(nums[i]) - 1] = nums[Math.abs(nums[i]) - 1] > 0 ? -nums[Math.abs(nums[i]) - 1] : nums[Math.abs(nums[i]) - 1];
        }
        for(int j = 0; j < nums.length; j++){
            if(nums[j] > 0){
                list.add(j + 1);
            }
        }
        return list;
    }
}
