class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        dfs(list, new StringBuilder(), n, 0, 0, 0);
        return list;
    }
    public void dfs(List<String> list, StringBuilder temp, int n, int left, int right, int count){
        if(right > left || count > n * 2) return;
        if(right == n && left == n && n * 2 == count){
            String str = temp.toString();
            list.add(str);
            return;
        }
            if(left < n ){
                temp.append("(");
                dfs(list, temp, n, left + 1, right, count + 1);
                temp.deleteCharAt(temp.length() - 1);}
            if(right < left ){
                temp.append(")");
                dfs(list, temp, n, left, right + 1, count + 1);
                temp.deleteCharAt(temp.length() - 1);}
    }
}
