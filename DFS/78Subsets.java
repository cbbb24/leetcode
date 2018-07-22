class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        dfs(list, new ArrayList<Integer>(), nums, 0);
        return list;
    }
    public void dfs(List<List<Integer>> list, List<Integer> temp, int[] nums, int start){
        list.add(new ArrayList<>(temp));
        for(int i = start; i < nums.length; i ++){
            temp.add(nums[i]);
            dfs(list, temp, nums, i + 1);
            temp.remove(temp.size() - 1);
        }
        return;
    }
}
