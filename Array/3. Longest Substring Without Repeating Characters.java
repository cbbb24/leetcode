class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0 || s.length() == 1) return s.length();
        int start = 0;
        int end = 0;
        Set<Character> set = new HashSet<>();
        set.add(s.charAt(0));
        int len = 0;
        for(int i = 1; i < s.length(); i++){
            char temp = s.charAt(i);
            while(set.contains(temp)){
                len = Math.max(len, end - start + 1);
                set.remove(s.charAt(start));
                start++;
                if(start > end){
                    break;                   
                }
            }
            end++;
            set.add(temp);
        }
        len = Math.max(len, end - start + 1); 
        return len;
    }
}
