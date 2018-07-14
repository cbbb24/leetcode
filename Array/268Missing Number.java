class Solution {
/*    public int missingNumber(int[] nums) {
        int mis = 0;
        Set<Integer> set = new HashSet<Integer>();
        for(int i : nums)
            set.add(i);
        for(int i = 0; i < nums.length + 1; i++){
            if(!set.contains(i))
                mis = i; 
        }
        return mis;
    }
*/
    public int missingNumber(int[] nums) {
        int res = 0;
        for(int i = 0; i < nums.length; i++){
            res ^= i;
            res ^= nums[i];
        }
        return res ^ nums.length;
    }
}
