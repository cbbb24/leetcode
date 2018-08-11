class Solution {
    public String longestPalindrome(String s) {
        if(s == null || s.length() == 0) return "";
        int start = 0, end = 0;
        for(int i = 0; i < s.length(); i++){
            int len1 = expand(i, i, s);
            int len2 = expand(i, i + 1, s);
            int len = Math.max(len1, len2);
            if(len > end - start){
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }
    public int expand(int left, int right, String s){        
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return right - left - 1;
    }
}
