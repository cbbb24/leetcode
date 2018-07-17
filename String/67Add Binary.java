class Solution {
    public String addBinary(String a, String b) {
        StringBuilder str = new StringBuilder();
        int carry = 0;
        int i = a.length(), j = b.length();
        for(; i > 0 || j > 0; i--, j--){
            int sum = carry;
            if(i > 0) sum += a.charAt(i - 1) - '0';
            if(j > 0) sum += b.charAt(j - 1) - '0';
            carry = sum / 2;
            str.append(sum % 2);
        }
        if(carry == 1) str.append(carry);
        return str.reverse().toString();
    }
}
