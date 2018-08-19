class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> res = new ArrayList<>();
        res.add(0);
        for(int i = 0; i < n; i++){
            for(int j = res.size() - 1; j >= 0; j--){
                int carry = 1 << i;
                res.add(res.get(j) + carry);
            }
        }
        return res;
    }
}
