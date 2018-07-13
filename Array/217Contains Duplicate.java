class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        boolean res = false;
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                    res = true;
                    break;
                }else{
                    map.put(nums[i], i);
                }
            }
        return res;
    }
}
