class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0; i < nums.length - 3; i++){
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            int sum_3 = target - nums[i];
            for(int j = i + 1; j < nums.length - 2; j++){                
                if(j > i + 1 && nums[j] == nums[j - 1]) continue;
                int sum_2 = sum_3 - nums[j];
                int start = j + 1;
                int end = nums.length -1;
                while(start < end){
                    if(nums[start] + nums[end] == sum_2){
                        list.add(Arrays.asList(nums[i], nums[j], nums[start], nums[end]));
                        while(start < end && nums[start] == nums[start + 1]) start++;
                        while(start < end && nums[end] == nums[end - 1]) end--;
                        start++;
                        end--;
                    }else if(nums[start] + nums[end] < sum_2){
                        start++;
                    }else
                        end--;
                }
            }
        }
        return list;
    }
}
