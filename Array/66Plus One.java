class Solution {
    public int[] plusOne(int[] digits) {
        int[] tmp = new int[digits.length + 1];
        tmp[0] = 1;
        digits[digits.length - 1] = digits[digits.length - 1] + 1;
        for(int i = 1; i < digits.length; i++){
            int k = digits.length - i;
            digits[k - 1] = digits[k] == 10 ? digits[k - 1] + 1 : digits[k - 1];
            digits[k] = digits[k] == 10 ? 0 : digits[k];           
        }
        return digits[0] == 10 ? tmp : digits;
    }
}
