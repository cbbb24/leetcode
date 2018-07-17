class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()) return true;
        int head = 0;
        int tail = s.length() - 1;
        while(head < tail){
            if(!Character.isLetter(s.charAt(head)) && !Character.isDigit(s.charAt(head))){
                head++;
                continue;
            }
            if(!Character.isLetter(s.charAt(tail)) && !Character.isDigit(s.charAt(tail))){
                tail--;
                continue;
            }
            if(Character.toLowerCase(s.charAt(head)) == Character.toLowerCase(s.charAt(tail))){
                head++;
                tail--;
                continue;
            }
            return false;
        }
        return true;
        
    }
}
