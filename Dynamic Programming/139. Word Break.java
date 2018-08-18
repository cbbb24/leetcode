class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for(int i = 1; i < s.length() + 1; i++){
            for(int j = 0; j < i; j++){
                if(dp[j] && search(s.substring(j, i), wordDict)){
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
    public boolean search(String s, List<String> wordDict){
        for(String temp : wordDict){
            if(s.equals(temp))
                return true;
        }
        return false;
    }
}
