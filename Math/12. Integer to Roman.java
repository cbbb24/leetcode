class Solution {
    public String intToRoman(int num) {
        String[] str = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "III", "II", "I"};
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 3, 2, 1};
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < str.length; i++){
            if(num >= values[i]){
                result.append(str[i]);
                num -= values[i];
                if(num == 0) break;
                i--;
            }
        }
        return result.toString();
    }
}
