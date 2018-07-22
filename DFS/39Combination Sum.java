class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        int sum = 0;
        dfs(list, new ArrayList<Integer>(), candidates, target, sum, 0);
        return list;
    }
    public void dfs(List<List<Integer>> list, List<Integer> temp, int[] candidates, int target, int sum, int start){
        if(sum == target) {list.add(new ArrayList<>(temp)); return;}
        if(sum > target) return;
        for(int i = start; i < candidates.length; i ++){
            temp.add(candidates[i]);
            sum += candidates[i];
            dfs(list, temp, candidates, target, sum, i);
            sum -= temp.get(temp.size() - 1);
            temp.remove(temp.size() - 1);            
        }
    }
}
