class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        backtrack(res, new ArrayList(), s, 0);
        return res;
    }
    public void backtrack(List<List<String>> res, List<String> cur, String s, int start){
        if(start == s.length()){
            res.add(new ArrayList(cur));
            return;
        }
        for(int i = start; i < s.length(); i++){
            if(ispalin(s, start, i)){
                if(start == i)
                    cur.add(Character.toString(s.charAt(i)));
                else
                    cur.add(s.substring(start, i + 1));
                backtrack(res, cur, s, i + 1);
                cur.remove(cur.size() - 1);
            }
        }
    }
    public boolean ispalin(String s, int l, int r){
        while(l <= r){
            if(s.charAt(l) == s.charAt(r)){
                l++;
                r--;
            }else
                return false;
        }
        return true;
    }
}
