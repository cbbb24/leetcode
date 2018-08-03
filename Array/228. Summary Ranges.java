class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if(nums.length == 0) return result;
        int start = 0, end = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] - nums[end] == 1){
                end++;
            }else{
                if(start == end){
                    result.add("" + nums[start]);
                    start = i;
                    end = i;
                }
                else{                                
                    result.add(nums[start] + "->" + nums[end]);
                    start = i;
                    end = i;
                }   
            }
        }
        if(start == end)
            result.add("" + nums[start]);
        else
            result.add(nums[start] + "->" + nums[end]);
        return result;
    }
}
