class Solution {
    public int myAtoi(String str) {
        int sign = 1, base = 0, i = 0;
        if(str.length() == 0) return 0;
        while(str.length() > i && str.charAt(i) == ' '){
            i++;
        }
        if(str.length() > i && str.charAt(i) == '-'){
            sign = -1;
            i++;
        }else if(str.length() > i && str.charAt(i) == '+'){
            i++;
        }
        while(i < str.length() && str.charAt(i) - '0' >= 0 && str.charAt(i) - '9'<= 9){
            if(base > Integer.MAX_VALUE / 10 || (base == Integer.MAX_VALUE / 10 && str.charAt(i) - '0' > 7)){
                if(sign > 0)
                    return Integer.MAX_VALUE;
                else
                    return Integer.MIN_VALUE;
            }
            base = base * 10 + (str.charAt(i++) - '0');
        }
        return base * sign;
    }
}
