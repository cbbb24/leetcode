class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]) + 1);
                if(map.get(nums[i]) > nums.length / 2){
                    count = nums[i];
                    break;
                }                   
            }else{
                map.put(nums[i], 1);
                count = nums[i];
            }
        }
        return count;
    }
}
