class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        if(s.indexOf("IV") != -1) sum -= 2;
        if(s.indexOf("IX") != -1) sum -= 2;
        if(s.indexOf("XL") != -1) sum -= 20;
        if(s.indexOf("XC") != -1) sum -= 20;
        if(s.indexOf("CD") != -1) sum -= 200;
        if(s.indexOf("CM") != -1) sum -= 200;
        char[] tmp = s.toCharArray();
        for(int i = 0; i < s.length(); i++){
            if(tmp[i] == 'I') sum += 1;
            if(tmp[i] == 'V') sum += 5;
            if(tmp[i] == 'X') sum += 10;
            if(tmp[i] == 'L') sum += 50;
            if(tmp[i] == 'C') sum += 100;
            if(tmp[i] == 'D') sum += 500;
            if(tmp[i] == 'M') sum += 1000;
        }
        return sum;
    }
}
