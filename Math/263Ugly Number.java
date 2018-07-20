class Solution {
    public boolean isUgly(int num) {
        int temp = num;
        if(temp <= 0) return false;
        if(temp == 1) return true;
        while(temp > 1){
            if(temp % 2 == 0){
                temp /= 2;
                continue;
            }
            if(temp % 3 == 0){
                temp /= 3;
                continue;
            }
            if(temp % 5 == 0){
                temp /= 5;
                continue;
            }
            return false;
        }
        return true;
    }
}
