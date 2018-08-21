class Solution {
    public int arrayNesting(int[] nums) {
        int max = 0;
        boolean[] visited = new boolean[nums.length];
        for(int i = 0; i < nums.length; i++){
            if(!visited[i]){
                int index = nums[i];
                visited[i] = true;
                int len = 1;
                while(nums[index] != nums[i]){
                    visited[index] = true;
                    len++;
                    index = nums[index];
            }
            max = Math.max(max, len);
            }
        }
        return max;
    }
}
