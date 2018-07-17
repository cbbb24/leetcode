class Solution {
    public int lengthOfLastWord(String s) {
        int len = s.length();
        if(len == 0) return 0;
        char space = ' ';
        int count = 0;
        int last = 0;
        for(int i = 0; i < len; i++){
            if(s.charAt(i) != space){
                count++;
                last = count;
            }else
                count = 0;
        }
        return last;
    }
}
