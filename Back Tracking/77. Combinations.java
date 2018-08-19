class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        comb(res, new ArrayList(), 1, n, k);
        return res;
    }
    public void comb(List<List<Integer>> res, List<Integer> single, int start, int n, int k){
        if(k == 0){
            res.add(new ArrayList(single));
            return;
        }
        for(int i = start; i <= n; i++){
            single.add(i);
            comb(res, single, i + 1, n, k - 1);
            single.remove(single.size() - 1);
        }
        
    }
}
