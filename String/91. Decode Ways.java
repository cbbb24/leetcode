class Solution {
    public int numDecodings(String s) {
        if(s == null || s.length() == 0) return 0;
        int current = s.charAt(0) == '0' ? 0 : 1;
        int last = 1;
        for(int i = 1; i < s.length(); i++){
            int tmp = current;
            if(s.charAt(i) == '0'){
                if(s.charAt(i - 1) == '1' || s.charAt(i - 1) == '2'){
                    current = last;
                }else{
                    return 0;
                }
            }else if(s.charAt(i - 1) == '1' || (s.charAt(i - 1) == '2' && s.charAt(i) <= '6')){
                current = tmp + last;
            }else{
                current = current;
            }
            last = tmp;
        }
        return current;
    }
}
