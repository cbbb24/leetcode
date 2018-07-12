class Solution {
/**    public int findPairs(int[] nums, int k) {
        if(k < 0){
            return 0;
        }
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int count = 0;
        for(int i : nums){
            if(map.containsKey(i)){
                if(k == 0 && map.get(i) == 1){
                    count++;
                }
                map.put(i, map.get(i) + 1);
            }else{
                if(map.containsKey(i - k)){
                    count++;
                }
                if(map.containsKey(i + k)){
                    count++;
                }
                map.put(i, 1);
            }
        }
        return count;
    }
    */
     public int findPairs(int[] nums, int k) {
        if(nums == null || nums.length == 0 || k < 0)
            return 0;
         int count = 0;
         Map<Integer, Integer> map = new HashMap<Integer, Integer>();
         for(int i = 0; i < nums.length; i++){
             map.put(nums[i], i);    /*如果有重复出现的元素，则i会不断刷新为最后一次出现的i*/
         }
         for(int i = 0; i < nums.length; i++){
             if(map.containsKey(nums[i] + k) && map.get(nums[i] + k) != i){  
                 map.remove(nums[i] + k);
                 count++;
             }
         }
         return count;         
    }

   
}
