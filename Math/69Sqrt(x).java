class Solution {
    public int mySqrt(int x) {
        if(x == 0 || x == 1) return x;
        int left = 1;
        int right = x;
        int temp = 0;
        while(left <= right){
            int mid = (left + right) / 2;
            if(mid > x / mid){
                right = mid - 1;
            }else{
                if(mid + 1 > x / (mid + 1)){
                    temp = mid;
                    break;
                }
                left = mid + 1;
            }
        }
        return temp;
    }
}
