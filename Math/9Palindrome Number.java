class Solution {
/**    public boolean isPalindrome(int x) {
        String temp = "" + x;
        for(int i = 0; i < temp.length() / 2; i++){
            if(temp.charAt(i) != temp.charAt(temp.length() - 1 - i))
                return false;
        }
        return true;
    }
*/
    public boolean isPalindrome(int x) {
        int rev = 0;
        if(x < 0 || (x % 10 == 0 && x != 0)) return false;
        if(x == 0) return true;
        while(x > rev){
            int temp = x % 10;
            x /= 10;
            rev = rev * 10 + temp;
            if(rev / 10 == x || rev == x) return true; 
        }
        return false;
    }
}
