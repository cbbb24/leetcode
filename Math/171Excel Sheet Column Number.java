class Solution {
    public int titleToNumber(String s) {
        int sum = 0;
        if(s.length() == 0) return sum;
        for(int i = 0; i < s.length(); i++){
            sum += (s.charAt(i) - 'A' + 1) * Math.pow(26, s.length() - 1 - i);
        }
        return sum;
    }
}
