class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> list = new ArrayList<>();
        dfs(list, new ArrayList<>(), k, n, 0, 1);
        return list;
    }
    public void dfs(List<List<Integer>> list, List<Integer> temp, int k, int n, int sum, int start){
        if(temp.size() > k || sum > n) return;
        if(temp.size() == k && sum == n){
            list.add(new ArrayList<>(temp));
            return;
        }
        for(int i = start; i < 10; i++){
            temp.add(i);
            dfs(list, temp, k, n, sum + i, i + 1);
            temp.remove(temp.size() - 1);
        }
    }
}
