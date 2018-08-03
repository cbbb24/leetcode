class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        if(nums.length == 0) return result;
        int counter1 = 0, counter2 = 0, candidate1 = 0, candidate2 = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == candidate1){
                counter1++;
            }else if(nums[i] == candidate2){
                counter2++;
            }else if(counter1 == 0){
                candidate1 = nums[i];
                counter1++;
            }else if(counter2 == 0){
                candidate2 = nums[i];
                counter2++;
            }else{
                counter1--;
                counter2--;
            }
        }
        counter1 = 0;
        counter2 = 0;
        for(int num : nums){
            if(num == candidate1)
                counter1++;
            else if(num == candidate2)
                counter2++;
        }
        if(counter1 > nums.length / 3)
            result.add(candidate1);
        if(counter2 > nums.length / 3)
            result.add(candidate2);
        return result;
    }
}
