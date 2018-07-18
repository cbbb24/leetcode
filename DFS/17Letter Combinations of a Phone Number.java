class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ret = new ArrayList<String>();
        if(digits.length() == 0) return ret;
        String[] tab = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        dfs(tab, ret, 0, "", digits);
        return ret;
    }
    public void dfs(String[] tab, List<String> ret, int offset, String prefix, String digits){
        if(offset == digits.length()){
            ret.add(prefix);
            System.out.println(ret + " " + offset + " " + digits.length());
            return;
        }
        String letters = tab[(digits.charAt(offset) - '0')];
        for(int i = 0; i < letters.length(); i++){
            dfs(tab, ret, offset + 1, prefix + letters.charAt(i), digits);
        }
    }
}
